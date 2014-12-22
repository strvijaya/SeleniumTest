
	import java.util.StringTokenizer;
	import java.util.ArrayList;
    import java.util.Collections;
      
   
	public class StringTokenizerClass {
		
	  	    public static void main(String[] args) {
	  	    	
	  	        String book = "title = Head First Java;" + "author = Emiley J;" + "publisher = McHough Publishers;" + "copyright = 2007;";
		      
	  	    	StringTokenizer st = new StringTokenizer(book, "=;");
	            while(st.hasMoreTokens()) {
	                String key = st.nextToken();
	                String val = st.nextToken();
	                System.out.println(key + "\t" + val);
	            }
	            
	            
	            String title = "Head First Java";
	            StringTokenizer st2 = new StringTokenizer(title);
	            while(st2.hasMoreTokens()) {
	                String word = st2.nextToken();
	                //System.out.println(word);
	                if (word.contains("First")) {
	                	System.out.println(title.indexOf(word));
	                }	                
	             }
	            
	            
	            System.out.println("*********");
	            System.out.println("*********");
	            
	            
                
	            
	            String title2 = "Head First Java";
	            String[] mytitle = title2.split(" ");
	            for (String word: mytitle) {
	            	System.out.println(word);
	            }
	            
	            System.out.println("*********");
	            System.out.println("*********");
	            
	           
	                    ArrayList<String> list = new ArrayList<String>();
	                    list.add("Java");
	                    list.add("Cric");
	                    list.add("Play");
	                    list.add("Watch");
	                    list.add("Glass");
	                    Collections.reverse(list);
	                    System.out.println("Results after reverse operation:");
	                    for(String str: list){
	                        System.out.println(str);
	                    }
	                    
	                    
	                    
	                            String str = "String    With Multiple      Spaces";
	                            StringTokenizer st6 = new StringTokenizer(str, " ");
	                            StringBuffer sb = new StringBuffer();
	                            while(st6.hasMoreElements()){
	                                sb.append(st6.nextElement());
	                                System.out.println(sb);
	                            }
	                            System.out.println(sb.toString());
	                        }
	                    }
	
	
	

	
	
	
	
	
