//package com.ginong.user.old;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.PrintStream;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//public class ProductRepository {
//	
//	private String dataSource = "E:\\Ginong\\Newlec\\Ginong\\src\\main\\webapp\\res\\data.txt";
//	
//	public List<Product> findAll() throws IOException {
//		
//		List<Product> list = new ArrayList<>();
//		
//		FileInputStream stream = new FileInputStream(dataSource);
//		Scanner scan = new Scanner(stream);
//		
//		//컬럼 버리기
//		if(scan.hasNextLine())
//			scan.nextLine();
//		
//		while(scan.hasNextLine()) {
//			
//			Product product = new Product();
//			
//			String line = scan.nextLine();
//			String[] tokens = line.split(",");
//			
//			product.setProductNo(Integer.parseInt(tokens[0]));
//			product.setCategory(tokens[1]);
//			product.setKorNm(tokens[2]);
//			product.setEngNm(tokens[3]);
//			product.setWeight(Integer.parseInt(tokens[4]) );
//			product.setQuantity(Integer.parseInt(tokens[5]));
//			product.setPrice(Integer.parseInt(tokens[6]));
//			product.setStock(Integer.parseInt(tokens[7]));
//			product.setImg(tokens[8]);
//			product.setMfg(Integer.parseInt(tokens[9]));
//			product.setExp(tokens[10]);
//			product.setStorageType(tokens[11]);
//			product.setDesc(tokens[12]);
//		
//			list.add(product);
//		}
//		scan.close();
//		stream.close();
//		
//		return list;
//	}
//	
//	public Product findById(int id) throws IOException {
//		
//		FileInputStream stream = new FileInputStream(dataSource);
//		Scanner scan = new Scanner(stream);
//		
//		//컬럼 버리기
//		if(scan.hasNextLine())
//			scan.nextLine();
//		
//		Product product = new Product();
//		while(scan.hasNextLine()) {
//			String line = scan.nextLine();
//			String[] tokens = line.split(",");
//			
//			if(id == Integer.parseInt(tokens[0])) {
//				
//				product.setProductNo(Integer.parseInt(tokens[0]));
//				product.setCategory(tokens[1]);
//				product.setKorNm(tokens[2]);
//				product.setEngNm(tokens[3]);
//				product.setWeight(Integer.parseInt(tokens[4]) );
//				product.setQuantity(Integer.parseInt(tokens[5]));
//				product.setPrice(Integer.parseInt(tokens[6]));
//				product.setStock(Integer.parseInt(tokens[7]));
//				product.setImg(tokens[8]);
//				product.setMfg(Integer.parseInt(tokens[9]));
//				product.setExp(tokens[10]);
//				product.setStorageType(tokens[11]);
//				product.setDesc(tokens[12]);
//				break;
//			}
//		}
//		scan.close();
//		stream.close();
//		return product;
//		
//	}
//	
//	
//	
//	public void save(Product product) throws IOException {
//		FileOutputStream stream = new FileOutputStream("res/Product.txt", true);
//		PrintStream pis = new PrintStream(stream);
//		
//		pis.printf("\n%d,%s,%s,%s,%d,%d,%d,%d,%s,%d,%d,%s,%s" 
//				, product.getProductNo()
//				, product.getCategory()
//				, product.getKorNm()
//				, product.getEngNm()
//				, product.getWeight()
//				, product.getQuantity()
//				, product.getPrice()
//				, product.getStock()
//				, product.getImg()
//				, product.getMfg()
//				, product.getExp()
//				, product.getStorageType()
//				, product.getDesc()
//				);
//		
//		pis.close();
//		stream.close();
//	}
//
//	public List<Product> findEarlyBirdList() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<Product> findSeasonOutList() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//}
