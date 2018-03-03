package com.stringislemleri;

public class runner {

	public static void main(String[] args) {
		
		String deger="afkjfksjdkldlkd";
		
		deger=" bugün günlerden cumartesi...u ";
		
		System.out.println(deger);
		
		//string uzunluðunu bulmak	
		System.out.println(deger.length());
		
		//string in baþýnda ve sonunda olan boþluklarý kýrpmak
		System.out.println(deger.trim());
		
		//strig içinde deðiþiklik yapmak
		System.out.println(deger.replace("c", "C"));
		System.out.println(deger.replace(" ", ""));
	
		//bir string içinde index numarasý verilen karakteri verir.
		System.out.println(deger.charAt(4));
		
		//bir string içinden verilen index aralýðýnda deðeri verir.
		System.out.println(deger.substring(7, 16));
		
		//iki string deðeri birleþtirmek için kullanýlýr.
		System.out.println(deger.concat("Neden ?"));
		System.out.println(deger+"Neden ????");
		
		
		//iki string içeriðin doðruluðunu gösterir.
		//deger="icerik";
		System.out.println(deger.equals("icerik"));
		System.out.println(deger=="icerik");
		
		//bir string içendeki bir karakterin yerini verir.
		System.out.println(deger.indexOf("ün"));
		System.out.println(deger.lastIndexOf("u"));
		System.out.println(deger.indexOf("ÞÞ"));
		
		//bir string  ifadenin boþ olup olmadýðýný sorgular.
		// boþ ise TRUE boþ deðil ise false döner
		deger="HERÞEY büyük Harfle Mi yazýLIR? ";
		System.out.println(deger.trim().isEmpty());
		
		
		//verilen string ifadeyi küçük harfe çevirir.
		System.out.println(deger.toLowerCase());
		//verilen string ifadeyi büyük harfe çevirir.
		System.out.println(deger.toUpperCase());
		
		//bir string dizisini verilen ifadeye göre parçalara böler
		//herbir parça için string dizisi oluþturulur.
		deger="ad:ali,soyad:ALÝ,telefon:0555 555 5555";
		System.out.println(deger.split(",")[0].split(":")[1]);
		System.out.println(deger.split(",")[1]);
		System.out.println(deger.split(",")[2]);
		
		
		
		
	}

}
