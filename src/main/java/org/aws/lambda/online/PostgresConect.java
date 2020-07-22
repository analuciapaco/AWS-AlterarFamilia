package org.aws.lambda.online;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.aws.lambda.data.RequestDetails;
import org.aws.lambda.data.ResponseDetails;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class PostgresConect implements RequestHandler<RequestDetails, ResponseDetails> {
	public ResponseDetails handleRequest(RequestDetails requestDetails, Context context) {
		// TODO Auto-generated method stub
		ResponseDetails responseDetails = new ResponseDetails();
		try {
			updateDetails(requestDetails, responseDetails);
		} catch (SQLException e) {
			responseDetails.setMessageID("999");
			responseDetails.setMessageReason("Registro não encontrado motivo: " + e.getCause());

		}
		return responseDetails;

	}

	private void updateDetails(RequestDetails requestDetails, ResponseDetails responseDetails) throws SQLException {
		Connection connection = null;
			connection = getConection();
			String query = getQuery(requestDetails);
			PreparedStatement statement = connection.prepareStatement(query);
			carregaParametros(statement, requestDetails);
			statement.executeUpdate();
			statement.close();
			connection.close();
			responseDetails.setMessageID(String.valueOf(2));
			responseDetails.setMessageReason("Registro alterado com sucesso!!");

	
	}

	private String getQuery(RequestDetails requestDetails) {

		String query = "UPDATE public.FAMILIAS set lider_de_rua_id=?, nome_do_representante_de_familia=?, logradouro=?, numero=?, "
				+ "complemento=?, ponto_de_referencia=?,telefone=?, data_nascimento=?, rg=?, cpf=?, "
				+ "numero_criancas=?, numero_adultos=?, numero_idosos=?, numero_habitantes_total=?,observacoes=? where id=?";
		System.out.println("O update: " + query);
		return query;
	}

	private PreparedStatement carregaParametros(PreparedStatement statement, RequestDetails requestDetails)
			throws SQLException {
		statement.setLong(1, requestDetails.getLider_de_rua_id());
		statement.setString(2, requestDetails.getNome_do_representante_de_familia());
		statement.setString(3, requestDetails.getLogradouro());
		statement.setInt(4, requestDetails.getNumero());
		statement.setString(5, requestDetails.getComplemento());
		statement.setString(6, requestDetails.getPonto_de_referencia());
		statement.setString(7, requestDetails.getTelefone());
		statement.setString(8, requestDetails.getData_nascimento());
		statement.setString(9, requestDetails.getRg());
		statement.setString(10, requestDetails.getCpf());
		statement.setInt(11, requestDetails.getNumero_criancas());
		statement.setInt(12, requestDetails.getNumero_adultos());
		statement.setInt(13, requestDetails.getNumero_idosos());
		statement.setInt(14, requestDetails.getNumero_habitantes_total());
		statement.setString(15, requestDetails.getObservacoes());
		statement.setLong(16, requestDetails.getId());

		return statement;

	}

	private Connection getConection() throws SQLException {
		String url = "jdbc:postgresql://conectainstancia.cbcskmsytoea.us-east-1.rds.amazonaws.com:5432/ConectaDB";
		String username = "AdminConecta";
		String password = "*abc*123";
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;

	}

}
