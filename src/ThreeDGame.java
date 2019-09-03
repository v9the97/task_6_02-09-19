import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class ThreeDGame extends Game{

	public static void main(String[] args) throws Exception {
		Game game=new Game();
		int z=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter x and y ,z values ");
		
		game.setX(sc.nextInt());
		game.setY(sc.nextInt());
		z=sc.nextInt();
		try{
			FileOutputStream fileout=new FileOutputStream("D:/vinod/recodetask6/serial.txt");
		ObjectOutputStream object=new ObjectOutputStream(fileout);
		object.writeObject(game);
 object.close();
 fileout.close();
		}catch (IOException e) {
			// TODO: handle exception
	e.printStackTrace();
		}
		
		
		FileInputStream fis=new FileInputStream("D:/vinod/recodetask6/serial.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		game=(Game)ois.readObject();
		ois.close();
		fis.close();
		
System.out.println("please enter x and y values ");
		
		
		
		game.setX(sc.nextInt()+game.getX());
		game.setY(sc.nextInt()+game.getY());
		System.out.println(" x "+game.getX());
		System.out.println("Y "+game.getY());
		System.out.println("z "+z);
		
		
	}

}
