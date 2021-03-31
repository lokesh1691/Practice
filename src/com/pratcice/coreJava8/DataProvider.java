package com.pratcice.coreJava8;
import java.sql.Connection;
/*
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.core.Logger;
import resources.AppConfig;
import resources.LogConfig;
import application.Order;
public class DataProvider {

	*/
/**
	 * Adds the order details given to the database table 'Chill n Grill'
	 *
	 * @param Order
	 * @return orderId
	 * @throws Exception
	 *//*


	public Integer addOrder(Order order) throws Exception {

		String sqlString = "insert into ChillNGrill_Orders values(?,?,?,?,?,?)";
		Integer orderId = null;

		try (
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.123.79.58:1521:georli03", "ER1234", "infy");
				PreparedStatement prepareStatement = connection.prepareStatement(sqlString);
		) {
			prepareStatement.setInt(1, order.getOrderId());
			prepareStatement.setString(2, order.getCustomerName());
			prepareStatement.setString(3, order.getOrderedItem());
			prepareStatement.setDouble(4, order.getTotalBillAmount());
			prepareStatement.setLong(5, order.getContactNo());
			prepareStatement.setString(6, order.getOrderedBranch());
			int result = prepareStatement.executeUpdate();
			if (result > 0)
				orderId = order.getOrderId();
		} catch (SQLException exception) {
			Logger logger = (Logger) LogConfig.getLogger(DataProvider.class);
			logger.error(exception.getMessage());
			throw new Exception("Technical Error. Please try after sometime. If the problem persists, contact your administrator");
		} catch (Exception exception) {
			throw exception;
		}
		return orderId;
	}

	*/
/**
	 * Retrieves the order details that was made at the particular branch
	 *
	 * @param orderedItem
	 * @return
	 * @throws Exception
	 *//*


	public List<Order> getOrders(String orderedBranch) throws Exception {


		String sqlString = "select * from ChillNGrill where orderedBranch=?";
		List<Order> listOfOrders = null;

		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.123.79.58:1521:georli03", "ER1234", "infy");
			 PreparedStatement prepareStatement = connection.prepareStatement(sqlString);
		) {

			prepareStatement.setString(1, orderedBranch);
			listOfOrders = new ArrayList<>();
			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Order order = new Order();
				order.setOrderId(resultSet.getInt("orderId"));
				order.setCustomerName(resultSet.getString(2));
				order.setOrderedItem(resultSet.getString(3));
				order.setTotalBillAmount(resultSet.getDouble(4));
				order.setContactNo(resultSet.getLong(5));
				order.setOrderedBranch(resultSet.getString(6));
				listOfOrders.add(order);
			}
			if (listOfOrders.size() == 0) {
				throw new Exception("There are no orders available in this branch");
			}
		} catch (SQLException exception) {
			exception.printStackTrace();
			Logger logger = (Logger) LogConfig.getLogger(DataProvider.class);
			logger.error(exception.getMessage());
			throw new Exception("Technical Error. Please try after sometime. If the problem persists, contact your administrator");
		} catch (Exception exception) {
			Logger logger = (Logger) LogConfig.getLogger(DataProvider.class);
			logger.error(exception.getMessage());
			throw exception;
		}
		return listOfOrders;
	}
}
*/
