/**
 * Copyright (C) 2021  Andreas Kaibel
 * a.kaibel@googlemail.com
 *  
 * This program is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the Free Software Foundation; 
 * either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU General Public License for more details.
 * For a copy of the GNU General Public License see <http://www.gnu.org/licenses/>. 
 * 
 * Diese Klasse dient nur dazu, die Klasse GUI zu testen.
 */
public class GUITest<ContentType> {
	private String textPrivat = "bbb";
	public String text;
	public boolean jaNein;
	public char buchstabe;
	public double doubleZahl;
	public float floatZahl;
	public int intZahl;
	

	private String getTextPrivat(){
		return textPrivat;
	}
	public char getBuchstabe() {
		return buchstabe;
	}

	public void setBuchstabe(char buchstabe) {
		this.buchstabe = buchstabe;
	}

	public boolean contentEqualsText(){
		if(content.equals(text)){
			return true;
		}
		return false;
	}

	public ContentType getContent() {
		return content;
	}

	public void setContent(ContentType content) {
		this.content = content;
	}

	public ContentType content;
	
	public GUITest(){
		buchstabe = 'a';
		text = "blabla";
		jaNein = false;
		doubleZahl = 3.0;
		intZahl = 2;
		floatZahl = 4;

	}
	
	public GUITest(String pString){
		this();
		text = pString;
		jaNein = true;
	}
	
	public GUITest(int a){
		this();
		intZahl = a;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	public double testMethode(int z1, double z2, float z3, String s1, boolean b4){
		double ergebnis = z2*z1*z3*s1.length();
		if(!b4){
			ergebnis = (-1)*ergebnis;
		}
		return ergebnis;
	}

	public String getText() {
		return text;
	}

	public boolean isJaNein() {
		return jaNein;
	}

	public void setJaNein(boolean jaNein) {
		this.jaNein = jaNein;
	}
	
	public int[] arrayInt(int laenge){
		int[] ergebnis = new int[laenge];
		for (int i = 0; i < ergebnis.length; i++) {
			ergebnis[i] = i;
		}
		return ergebnis;
	}

	public String[] arrayString(int laenge){
		String[] ergebnis = new String[laenge];
		for (int i = 0; i < ergebnis.length; i++) {
			ergebnis[i] = ""+i;
		}
		return ergebnis;
	}
	public double getDoubleZahl() {
		return doubleZahl;
	}

	public void setDoubleZahl(double doubleZahl) {
		this.doubleZahl = doubleZahl;
	}

	public float getFloatZahl() {
		return floatZahl;
	}

	public void setFloatZahl(float floatZahl) {
		this.floatZahl = floatZahl;
	}

	public int getIntZahl() {
		return intZahl;
	}

	public void setIntZahl(int intZahl) {
		this.intZahl = intZahl;
	}
	
	public String langerString(int anzahl){
		String ergebnis = "";
		for(int i=1; i<=anzahl; i++){
			ergebnis += i+", ";
		}
		return ergebnis;
	}
	
	public static void main(String[] args) {
		GUITest<String> gt = new GUITest<String>();
		//Vector<String> s = new Vector<String>();
		GUI gg = new GUI(gt);
	}
}
