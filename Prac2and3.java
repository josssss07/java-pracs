	//Write a method called display which shows only the center word from a sentence
public class Prac2and3 {
    public static void main(String[] args) {
        String s = "We are learning about strings";

        Prac2and3 t = new Prac2and3();
        System.out.println(s);
        String wordToDelete = "learning"; // Specify the word to delete
        t.alternateRevers(s);
    }

    void deleteWord(String s, String wordToDelete) {
        String[] sarr = s.split("\\s+");
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < sarr.length; i++) {
            if (!sarr[i].equals(wordToDelete)) {
                newString.append(sarr[i]).append(" ");
            }
        }
        
        System.out.println(newString.toString().trim());
    }

	void alternateRevers(String s) {
		String newString = "";
		
		String[] sarr = s.split("\\s+");
		
		for(int i = 0; i<sarr.length; i++) {
			if(i%2 == 0) {
				StringBuffer sb = new StringBuffer(sarr[i]);
				newString = newString + sb.reverse() + " ";
				
			}
			else {
				newString = newString + sarr[i] + " ";
			}
			
		}
		
		System.out.println(newString);
}
}



/* 
//Q1 convert alternating words to uppercase:
public class Prac2and3{
    public static void main(String[] args){
        String s = "We are learning about strings";

        Prac2and3 t = new Prac2and3();
        System.out.println(s);
        t.alternate(s);

    }
    void alternate(String s){
        String newString = "";
        String[] sarr = s.split("\\s+");
        for(int i = 0; i<sarr.length; i++){
            if (i%2==0){                newString= newString+ sarr[i].toUpperCase()+ " ";
            }
            else{
                newString = newString+ sarr[i]+" ";
            }
        }
        System.out.println(newString);
    }
}



//Q2 Write a method called display which shows only the center word from a sentence

//Q3 Write a method to find the longest word in a string 

//Q5 Reverse alternate words in a string 

//Q6 Write a method that deletes string word from the sentence 

public class Student {
	
	public static void main(String[] args) {
	String s = "We are learning about strings";
	
	Student m = new Student();
	
	m.alternate(s);
	m.longestWord(s);
	m.middleWord(s);
	m.stringReverse(s);
	m.alternateRevers(s);
}


	
	//Q1`
	void alternate(String s) {
		String newString = "";
		
		String[] sarr = s.split("\\s+");
		
		for(int i = 0; i<sarr.length; i++) {
			if(i%2 == 0) {
				newString = newString + sarr[i].toUpperCase()+ " ";
			}
			else {
				newString = newString + sarr[i] + " ";
			}
			
		}
		
		System.out.println(newString);
}
	//O2
	
	void longestWord(String s) {
		String longest="";
		
		String[] sarr = s.split("\\s+");
		int max= 0;
		String maxstr= "";
		for(String str: sarr) {
			int n = str.length();
			if(n> max) {
				max = n;
				maxstr = str;
			}
				
		}
		System.out.println(maxstr);
	}
	
	
	//Q3
	
	void middleWord(String s) {
		
		String[] sarr = s.split("\\s+");
		
		String newString = "";
		
		
		int strLenght = sarr.length;
		int length = strLenght;
		if(length % 2 == 0) {
			newString = sarr[(length/2)-1] + " " + sarr[(length/2)];
		}
		
		else {
			newString = sarr[(length/2)];
		}
		
		System.out.println("Middle word is "+ newString);
	}
	
	
	void stringReverse(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}
	
	void alternateRevers(String s) {
		String newString = "";
		
		String[] sarr = s.split("\\s+");
		
		for(int i = 0; i<sarr.length; i++) {
			if(i%2 == 0) {
				StringBuffer sb = new StringBuffer(sarr[i]);
				newString = newString + sb.reverse() + " ";
				
			}
			else {
				newString = newString + sarr[i] + " ";
			}
			
		}
		
		System.out.println(newString);
}
}

*/