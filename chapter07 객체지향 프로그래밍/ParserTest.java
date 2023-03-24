interface Parseable{ // interface Ŭ����
	// ���� �м��۾��� �����Ѵ�.
	public abstract void parse(String fileName);
}

class ParserManager{ // return type�� interface Parseable�̴�. ������ HTMLParser()�̱� ������
	// �̰��� HTMLParser�� �ν��Ͻ��� �����ϴ� ���̴�. �� interface�� �����ϴ� �ν��Ͻ��� ����.
	// ����Ÿ���� Parseable�������̽��̴�.
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable{ // interface�� �����ϴ� 
	public void parse(String fileName) {
		/* ���� �м��۾��� �����ϴ� �ڵ带 ���´�. */
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		/* ���� �м��۾��� �����ϴ� �ڵ带 ���´�. */
		System.out.println(fileName + "-HTML parsing completed.");
	}
}

class ParserTest{
	public static void main(String args[]) {
		Parseable parser = ParserManager.getParser("XML");
		// getParser �Լ��� ���� new XMLParser() ȣ��.
		parser.parse("document.xml");
		// XML���� ������ parse �Լ��� ����.
		parser = ParserManager.getParser("HTML");
		// HTMLParser() ȣ��.
		parser.parse("document2.html");
		// HTML���� ������ parse �Լ��� ����.
	}
}