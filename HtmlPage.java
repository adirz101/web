
import java.io.*;
import java.util.Scanner;
public class HtmlPage {

	public static void main(String[] args) {
		File file = new File("htmlpage.html");
		Scanner scan = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			String doc = "<!DOCTYPE html>";
			String head = "<head>";
			String body = "<body>";
			bw.write(doc);
			bw.newLine();
			bw.write(head);
			bw.write("<style type="+'"'+"text/css"+'"'+">");
			System.out.println("put the number of Columns(until 50):");
			int c = scan.nextInt();
			if(c>50 || c<0) {
				System.out.println("The number is invalid");
				return;
			}
			int width = 1700/c;
			int color = 0;
			for(int i=0;i<c;i++) {
				bw.write(".a"+i+"{");
				bw.newLine();
				bw.write("width:"+width+"px;");
				bw.newLine();
				bw.write("height:1000px;");
				bw.newLine();
				switch(color) {
				case 0: 
					bw.write("background:blue;");
					color++;
					bw.newLine();
					break;
				case 1:
					bw.write("background:red;");
					color++;
					bw.newLine();
					break;
				case 2:
					bw.write("background:green;");
					color=0;
					bw.newLine();
					break;
				}
				bw.write("position:fixed;");
				bw.newLine();
				bw.write("top:0;");
				bw.newLine();
				int j = width*i;
				bw.write("left:"+i*width+"px;");
				bw.newLine();
				bw.write("}");
				bw.newLine();
			}
			bw.write("</style>");
			bw.write("</head>");
			bw.newLine();
			bw.write(body);
			bw.newLine();
			for(int i=0;i<c;i++) {
				bw.write("<div class="+'"'+"a"+i+'"'+"></div></html>");
				bw.newLine();
			}
			
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
