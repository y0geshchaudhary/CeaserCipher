
public class CeaserCipher {

	public static void main(String[] args) {
		
		String input = "aBCdE";
		int key=5;
		CeaserCipher c = new CeaserCipher();
		System.out.println(c.encrypt(input, key));
		System.out.println(c.decrypt(c.encrypt(input, key), key));
		System.out.println(c.key(input,c.encrypt(input, key)) );

	}
	
	String encrypt(String input, int key){
		char[] caps = {'A',
				'B',
				'C',
				'D',
				'E',
				'F',
				'G',
				'H',
				'I',
				'J',
				'K',
				'L',
				'M',
				'N',
				'O',
				'P',
				'Q',
				'R',
				'S',
				'T',
				'U',
				'V',
				'W',
				'X',
				'Y',
				'Z'};
		char[] small = {'a',
				'b',
				'c',
				'd',
				'e',
				'f',
				'g',
				'h',
				'i',
				'j',
				'k',
				'l',
				'm',
				'n',
				'o',
				'p',
				'q',
				'r',
				's',
				't',
				'u',
				'v',
				'w',
				'x',
				'y',
				'z'};
		
		int a;
		char alphabet, newApha = 0, output[] = new char[input.length()];
		for(int i=0;i<input.length();i++){
			alphabet= input.charAt(i);
			for(int j =0;j<26;j++){
				if(caps[j]==alphabet){
					a=(j+key)%26;
					newApha= caps[a];
				}
			}
			for(int j =0;j<26;j++){
				if(small[j]==alphabet){
					a=(j+key)%26;
					newApha= small[a];
				}
			}
			//System.out.print(newApha);
			output[i]=newApha;
			/*if(65<=input.charAt(i) || 90>=input.charAt(i) ||  97<=input.charAt(i) || 122>=input.charAt(i))
				result=(int)(input.charAt(i) + key) % 26;
			else result = input.charAt(i);
			list.add((char) result);*/
		}
		
		/*System.out.println(list);
		StringBuilder builder = new StringBuilder(list.size());
		for(char c : list){
			builder.append(c);
		}
		output = builder.toString();*/
		return String.copyValueOf(output);
	}

	
	String decrypt(String input, int key){
		char[] caps = {'A',
				'B',
				'C',
				'D',
				'E',
				'F',
				'G',
				'H',
				'I',
				'J',
				'K',
				'L',
				'M',
				'N',
				'O',
				'P',
				'Q',
				'R',
				'S',
				'T',
				'U',
				'V',
				'W',
				'X',
				'Y',
				'Z'};
		char[] small = {'a',
				'b',
				'c',
				'd',
				'e',
				'f',
				'g',
				'h',
				'i',
				'j',
				'k',
				'l',
				'm',
				'n',
				'o',
				'p',
				'q',
				'r',
				's',
				't',
				'u',
				'v',
				'w',
				'x',
				'y',
				'z'};
		
		int a;
		char alphabet, newApha = 0, output[] = new char[input.length()];
		for(int i=0;i<input.length();i++){
			alphabet= input.charAt(i);
			for(int j =0;j<26;j++){
				if(caps[j]==alphabet){
					a=(j-key);
					if(a<0) a= (-1*a)%26;
					newApha= caps[a];
				}
			}
			for(int j =0;j<26;j++){
				if(small[j]==alphabet){
					a=(j-key);
					if(a<0) a= (-1*a)%26;
					newApha= small[a];
				}
			}
			//System.out.print(newApha);
			output[i]=newApha;
			/*if(65<=input.charAt(i) || 90>=input.charAt(i) ||  97<=input.charAt(i) || 122>=input.charAt(i))
				result=(int)(input.charAt(i) + key) % 26;
			else result = input.charAt(i);
			list.add((char) result);*/
		}
		
		/*System.out.println(list);
		StringBuilder builder = new StringBuilder(list.size());
		for(char c : list){
			builder.append(c);
		}
		output = builder.toString();*/
		return String.copyValueOf(output);
	}

	int key(String input, String output){
		int key;
		char[] caps = {'A',
				'B',
				'C',
				'D',
				'E',
				'F',
				'G',
				'H',
				'I',
				'J',
				'K',
				'L',
				'M',
				'N',
				'O',
				'P',
				'Q',
				'R',
				'S',
				'T',
				'U',
				'V',
				'W',
				'X',
				'Y',
				'Z'};
		char[] small = {'a',
				'b',
				'c',
				'd',
				'e',
				'f',
				'g',
				'h',
				'i',
				'j',
				'k',
				'l',
				'm',
				'n',
				'o',
				'p',
				'q',
				'r',
				's',
				't',
				'u',
				'v',
				'w',
				'x',
				'y',
				'z'};
		char inChar=input.charAt(0);
		char outChar=output.charAt(0);
		int inInt = 0,outInt = 0;
		for(int j =0;j<26;j++){
			if(caps[j]==inChar){
				inInt=j;
					for(int k=0;k<26;k++){
						if(caps[k]==outChar){
							outInt=k;
							break;
						}
					}
				}
			if(small[j]==inChar){
				inInt=j;
					for(int k=0;k<26;k++){
						if(small[k]==outChar){
							outInt=k;
							break;
						}
					}
				}
			}
			if(inInt>outInt){
				key=inInt-outInt;
			}
			key=outInt-inInt;
		
		return key;
	}
}
