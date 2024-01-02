import java.util.Scanner;

public class bucket{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int bucket, oprate, pkt,i,np=0,n=0;
		System.out.print("Enter the Bucket Size: ");
		bucket=sc.nextInt();
		System.out.print("Enter the Output Rate: ");
		oprate=sc.nextInt();
		int[] packet=new int[20];
		System.out.print("Enter the number of Packets: ");
		pkt=sc.nextInt();
		System.out.println("Enter the Packets: ");
		for(i=0;i<pkt;i++)
			packet[i]=sc.nextInt();
		for(i=0;i<pkt;i++){
			if(packet[i]<=bucket){
				np=packet[i];
				if(np>oprate){
					while(np>oprate){
						np-=oprate;
						System.out.println((oprate)+" bits of packet "+(i+1)+" is sent to the transmission line");
						   }
					if(np>0)
					System.out.println((np)+" bits of packet "+(i+1)+" is sent to the transmission line");
					System.out.println(" ");

					
					     }
                                else{
					System.out.println(" ");
                           		System.out.println((packet[i])+" bits of Packet "+(i+1)+" is sent to the transmission line");
					System.out.println(" ");
   				            }

				}
			else{
	        System.out.println(" ");
	        System.out.print("Bucket Overflow");
                break;
}
}
}
}