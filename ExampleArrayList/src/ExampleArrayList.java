import java.util.ArrayList;

/**
 * This class shows an example about Arrays and ArrayList
 * @author: Paco Gómez Arnal
 * @version: 10/03/2014
 * @see <a href = "https://vimeo.com/channels/686565" /> Vimeo channel </a>
 * @see <a href="mailto:fjgomez@florida-uni.es">Contact with Paco Gómez </a> </a>
 */
public class ExampleArrayList {

	public static void main(String[] args) {
		//Static array
		String colours[]={"Red","Blue","Green"};
		//Dinamyc array
		ArrayList<String> coloursList=new ArrayList<String>();
		
		//Example of array work
		System.out.println("------------- STATIC ARRAY -------------");
		System.out.println("Number of elements: "+colours.length);
		
		for(int i=0;i<colours.length;i++)
		{
			System.out.print(colours[i]+",");
		}
		System.out.println();
		
		//Example of arrayList
		System.out.println("------------- DYNAMIC ARRAY -------------");
		
		//Fill in arrayList
		for(int i=0;i<colours.length;i++)
		{
			coloursList.add(colours[i]);
		}
		System.out.println("Number of elements: "+coloursList.size());
		
		//Adding other element
		coloursList.add("Purple");
		System.out.println("Number of elements: "+coloursList.size());
		
		//Go through arraylist
		for(int i=0;i<coloursList.size();i++)
		{
			System.out.print(coloursList.get(i)+",");
		}
		System.out.println();
		
		//Removing last element
		coloursList.remove(coloursList.size()-1);
		
		//Go through arraylist
		for(int i=0;i<coloursList.size();i++)
		{
			System.out.print(coloursList.get(i)+",");
		}
		System.out.println();
		
		
	}

}
