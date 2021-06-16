package factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.model.Order;

public class FactoryOrder {
	private FileInputStream fileInput;
	private FileOutputStream fileOutput;
	private ObjectInputStream objectInput;
	private ObjectOutputStream objectOutput;
	private File file;
	private final String filename;
	{
		filename="factoryOrder.ser";
		
		try {
			file=new File(filename);
			fileOutput=new FileOutputStream(file);
			objectOutput=new ObjectOutputStream(fileOutput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void saveOrder(List<Order> list) throws IOException
	{
		objectOutput.writeObject(list);
		System.out.println("Order Saved Sucessfully.!");
		
	}
	public List<Order> displayAllOrders() throws IOException, ClassNotFoundException
	{
		fileInput = new FileInputStream(file);
		objectInput = new ObjectInputStream(fileInput);
		@SuppressWarnings("unchecked")
		List<Order> orders = (List<Order>) objectInput.readObject();
		return orders;
	}
	
	

}
