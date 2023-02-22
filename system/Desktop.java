package org.system;

public class Desktop extends Computer
{
    public void desktopSize(int size) 
    {
			System.out.println("Desktop size is "+size+" inch.");
	}
	public static void main(String[] args)
	{
			Desktop desk=new Desktop();
			desk.computerModel("Dell");
			desk.desktopSize(30);

	}



}
