//mobuat ngebaca si character ama spellnya  blm dilanjutin baru dpt referensi
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;    
// public class driverkartu{
//     public static void main(String[] args) {

//         BufferedReader br = null;
//         try{ 
//             br = new BufferedReader(new FileReader("C:\\character.csv"));  
 
//             //One way of reading the file
//             System.out.println("Reading the file using readLine() method:");
//             String contentLine = br.readLine();
//             while (contentLine != null) {
//                 System.out.println(contentLine);
//                 contentLine = br.readLine();
//              } 
//         } 
//         catch (IOException ioe) {
//             ioe.printStackTrace();
//         } 
//         finally{
//             try{
//                 if (br != null){
//                     br.close();
//                 }
//             } 
//             catch (IOException ioe){
//                 System.out.println("Error in closing the BufferedReader");
//             }
//         }
//     }
// }
