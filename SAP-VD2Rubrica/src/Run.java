import java.io.FileInputStream;
import java.io.InputStream;

public class Run {

	public static void main(String[] args) {
		String arqX = "C:\\Users\\rcanno1\\Documents\\SAP\\gvxsapsum_202001ff_folha.txt";
		String arqData = "C:\\Users\\rcanno1\\Documents\\SAP\\pgto.horista.mensalista.txt";
		
		
		StringBuilder reader = new StringBuilder();
		int Char;
		char type;
		Long prevKey = null;
		try {
			InputStream	dados = new FileInputStream(arqX);
			
			System.out.println("Inicio da Leitura de Dados");
			while ((Char = dados.read()) != -1) {
				reader.append(Char);
			}
			System.out.println(reader.toString());
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
