package com.stringislemleri;

public class runner {

	public static void main(String[] args) {
		
		String deger="afkjfksjdkldlkd";
		
		deger=" bug�n g�nlerden cumartesi...u ";
		
		System.out.println(deger);
		
		//string uzunlu�unu bulmak	
		System.out.println(deger.length());
		
		//string in ba��nda ve sonunda olan bo�luklar� k�rpmak
		System.out.println(deger.trim());
		
		//strig i�inde de�i�iklik yapmak
		System.out.println(deger.replace("c", "C"));
		System.out.println(deger.replace(" ", ""));
	
		//bir string i�inde index numaras� verilen karakteri verir.
		System.out.println(deger.charAt(4));
		
		//bir string i�inden verilen index aral���nda de�eri verir.
		System.out.println(deger.substring(7, 16));
		
		//iki string de�eri birle�tirmek i�in kullan�l�r.
		System.out.println(deger.concat("Neden ?"));
		System.out.println(deger+"Neden ????");
		
		
		//iki string i�eri�in do�rulu�unu g�sterir.
		//deger="icerik";
		System.out.println(deger.equals("icerik"));
		System.out.println(deger=="icerik");
		
		//bir string i�endeki bir karakterin yerini verir.
		System.out.println(deger.indexOf("�n"));
		System.out.println(deger.lastIndexOf("u"));
		System.out.println(deger.indexOf("��"));
		
		//bir string  ifadenin bo� olup olmad���n� sorgular.
		// bo� ise TRUE bo� de�il ise false d�ner
		deger="HER�EY b�y�k Harfle Mi yaz�LIR? ";
		System.out.println(deger.trim().isEmpty());
		
		
		//verilen string ifadeyi k���k harfe �evirir.
		System.out.println(deger.toLowerCase());
		//verilen string ifadeyi b�y�k harfe �evirir.
		System.out.println(deger.toUpperCase());
		
		//bir string dizisini verilen ifadeye g�re par�alara b�ler
		//herbir par�a i�in string dizisi olu�turulur.
		deger="ad:ali,soyad:AL�,telefon:0555 555 5555";
		System.out.println(deger.split(",")[0].split(":")[1]);
		System.out.println(deger.split(",")[1]);
		System.out.println(deger.split(",")[2]);
		
		
		
		
	}

}
