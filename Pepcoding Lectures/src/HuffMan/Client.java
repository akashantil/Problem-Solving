package HuffMan;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncoderDecoder a = new EncoderDecoder("aaaaaaaaaaaaaaaaaaaaaaaabbbbbbaaaaaaaaaaaaaaaaaaaaabccccffdfdffdgffcgnavsgdhsadsbbhfsdabcsdbvhdvbjhfdvbjfdhvbdbfvd");
		String x=(a.encoder("aaabbc"));
		
		System.out.println(x);
		System.out.println(a.encMAp);
		System.out.println(a.Decoder(x));

	}

}
