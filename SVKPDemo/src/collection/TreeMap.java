package collection;
  

public class TreeMap {
  

    static void Example1stConstructor()
    {

        TreeMap tree_map
            = new TreeMap();
  
    
        tree_map.put(15, "Lokesh");
        tree_map.put(20, "Kandiboina");
        tree_map.put(25, "loki");
    
  
        System.out.println("Loki: " + tree_map);
    }
  
  
    private void put(int i, String string) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args)
    {
        System.out.println("loki using "
                           + "loki() constructor:\n");
  
      
        Example1stConstructor();
    }
}