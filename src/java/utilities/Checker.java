/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author NewtonA
 */
public class Checker {
	public static void main(String[] args) throws Exception {
		String passwordEnc = AESencrp.encrypt("dddddd");
		String passwordDec = AESencrp.decrypt("o/mZ2vNTEu2LP2Hc5AHJ+Q==");
		

		System.out.println("Encrypted Text : " + passwordEnc);
		System.out.println("Decrypted Text : " + passwordDec);
                System.out.println(AESencrp.decrypt("VjSd1kaUmK5W0mVz7RuNa1iuBYOqoGKqPtzfal2hsQjf7vZuaPbOHB2tuR63XQGTsxchi2ycxtogprYmkLRCNA=="));
                System.out.println(AESencrp.decrypt("B7Y1XHuAW6Z+0gmPPeO9KA=="));
                System.out.println(AESencrp.decrypt("x9gZImcpXy5sqB38VPtfUw=="));
	}
}
