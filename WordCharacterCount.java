import java.io.*;
class WordCharacterCount 
{
	public static void main(String[] args) throws IOException
	{
		
		
		File file=new File("E:\\StringManipulation\\Sample.txt");
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);

        String line;
        int wc = 0;
        int wordCount = 0;
        int characterCount = 0;
        int lineCount = 0;
      
        
        while ((line = br.readLine()) != null) {  
                lineCount++;
                wordCount = 0;
                 String s= line.substring(0, line.length() - 2);
                System.out.println("Line "+lineCount +": "+ s);
                
                String words[] = s.split("\\s+");
                wordCount += words.length;
                wc += words.length;
                System.out.println("Number of words : "+ wordCount);
                for(int i=0;i<words.length;i++){
               
                while (i < words.length && words[i] != null) {
                s="";
                s = s + words[i];
                System.out.println("Word : "+s + " - " + s.length()); 
                characterCount+=s.length();  
                i++;
                 }      
            }
            System.out.println("\n ");   
            }
             System.out.println("Total number of lines : "+lineCount); 
             System.out.println("Total number of Words : "+wc); 
             System.out.println("Total number of charcters in words : "+characterCount); 
             
        	
	}
}
