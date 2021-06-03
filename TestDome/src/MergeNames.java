import java.util.stream.Stream;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
    	
    	String[] resultado = (String[]) Stream.concat(Stream.of(names1), Stream.of(names2))
    							.distinct().toArray(str -> new String[str]);
    	
    	
    	return resultado;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}