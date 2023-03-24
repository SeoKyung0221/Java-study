interface Parseable{ // interface 클래스
	// 구문 분석작업을 수행한다.
	public abstract void parse(String fileName);
}

class ParserManager{ // return type이 interface Parseable이다. 하지만 HTMLParser()이기 때문에
	// 이것은 HTMLParser의 인스턴스를 리턴하는 것이다. 즉 interface를 구현하는 인스턴스를 제공.
	// 리턴타입이 Parseable인터페이스이다.
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

class XMLParser implements Parseable{ // interface를 구현하는 
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + "-HTML parsing completed.");
	}
}

class ParserTest{
	public static void main(String args[]) {
		Parseable parser = ParserManager.getParser("XML");
		// getParser 함수에 의해 new XMLParser() 호출.
		parser.parse("document.xml");
		// XML에서 구현한 parse 함수가 적용.
		parser = ParserManager.getParser("HTML");
		// HTMLParser() 호출.
		parser.parse("document2.html");
		// HTML에서 구현한 parse 함수가 적용.
	}
}