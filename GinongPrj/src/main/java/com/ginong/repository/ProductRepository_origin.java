package com.ginong.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ginong.entity.Product;

public class ProductRepository_origin {

	public List<Product> findAll() {

		List<Product> list = new ArrayList<>();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@db.newlecture.com:1521/xepdb1";
			Connection con = DriverManager.getConnection(url, "RLAND", "0530");

			String sql = "select * from TBL_GN_PRODUCT";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

				Product product = new Product();
				product.setProductId(rs.getInt("PRODUCT_ID"));
				product.setWeight(rs.getInt("WEIGHT"));
				product.setQuantity(rs.getInt("QUANTITY"));
				product.setPrice(rs.getInt("PRICE"));
				product.setStock(rs.getInt("STOCK"));
				product.setLike(rs.getInt("LIKE"));
				product.setRecommendation(rs.getInt("RECOMMENDATION"));
				product.setMfg(rs.getDate("MFG"));
				product.setState(rs.getString("STATE"));
				product.setCategory(rs.getString("CATEGORY"));
				product.setKorName(rs.getString("KOR_NAME"));
				product.setEngName(rs.getString("ENG_NAME"));
				product.setImg(rs.getString("IMG"));
				product.setExp(rs.getString("EXP"));
				product.setStorageType(rs.getString("STORAGE_TYPE"));
				product.setDesc(rs.getString("DESC"));

				list.add(product);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public Product findById(int productId) {
		// TODO Auto-generated method stub

		Product product = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@db.newlecture.com:1521/xepdb1";
			String user = "RLAND";
			String pwd = "0530";
			String sql = "SELECT * FROM TBL_GN_PRODUCT WHERE PRODUCT_ID = " + productId;

			Connection con = DriverManager.getConnection(url, user, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				product = new Product();

				product.setProductId(rs.getInt("PRODUCT_ID"));
				product.setWeight(rs.getInt("WEIGHT"));
				product.setQuantity(rs.getInt("QUANTITY"));
				product.setPrice(rs.getInt("PRICE"));
				product.setStock(rs.getInt("STOCK"));
				product.setLike(rs.getInt("LIKE"));
				product.setRecommendation(rs.getInt("RECOMMENDATION"));
				product.setMfg(rs.getDate("MFG"));
				product.setState(rs.getString("STATE"));
				product.setCategory(rs.getString("CATEGORY"));
				product.setKorName(rs.getString("KOR_NAME"));
				product.setEngName(rs.getString("ENG_NAME"));
				product.setImg(rs.getString("IMG"));
				product.setExp(rs.getString("EXP"));
				product.setStorageType(rs.getString("STORAGE_TYPE"));
				product.setDesc(rs.getString("DESC"));

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return product;
	}
}
