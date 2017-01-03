package my;

import java.io.*;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Enumeration;

public class KeystoreApp {

    public static void main (String[] args) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException, UnrecoverableEntryException {
//keytool -list -keystore "C:\Program Files\Java\jdk1.8.0_111\jre\lib\security\cacerts" -alias godaddyrootg2ca -v
        String ALG = "";
        final String aliasCert = "cert";
        final char[] pass = "password".toCharArray();
        final KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());

        ks.load(null, pass);
//        try (FileInputStream inputStream = new FileInputStream("C:/Users/ikysil/myProgKeystore")) {
//            ks.load(inputStream, pass);
//        }
        ks.setEntry(aliasCert, new KeyStore.TrustedCertificateEntry(new Certificate("X.509") {
            @Override
            public byte[] getEncoded() throws CertificateEncodingException {
                return new byte[0];
            }

            @Override
            public void verify(PublicKey key) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {

            }

            @Override
            public void verify(PublicKey key, String sigProvider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {

            }

            @Override
            public String toString() {
                return null;
            }

            @Override
            public PublicKey getPublicKey() {
                return null;
            }
        }), null);

        try (FileOutputStream outputStream = new FileOutputStream("C:/Users/ikysil/myProgKeystore")) {
            ks.store(outputStream, pass);
        }
        //load(new FileInputStream("C:\\Program Files\\Java\\jdk1.8.0_111\\jre\\lib\\security\\cacerts"), "changeit".toCharArray());

    }

}
