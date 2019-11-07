/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.dao;

import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.apache.commons.mail.EmailAttachment;
import projeto.com.apoio.Config;

/**
 *
 * @author ruiwa
 */
public class DaoEnviaEmail {

    public static void EnviaEmail(String email, String assunto, String mensagem, String anexo) {
        Properties props = new Properties();

        props.put("mail.smtp.host", Config.mail_smtp_host);
        props.put("mail.smtp.socketFactory.port", Config.mail_smtp_socketFactory_port);
        props.put("mail.smtp.socketFactory.class", Config.mail_smtp_socketFactory_class);
        props.put("mail.smtp.auth", Config.mail_smtp_auth);
        props.put("mail.smtp.port", Config.mail_smtp_port);

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(Config.mail_userAuthentication, Config.mail_passwordAuthentication);
            }
        });

        session.setDebug(true);

        try {

            // Monta email
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Config.mail_sender));
            Address[] toUser = InternetAddress.parse(email + ",rmachado31@gmail.com");//Config.mail_to_user+",ruiwarz@gmail.com");
            message.setRecipients(Message.RecipientType.TO, toUser);

            //message.setSubject("TESTE DE ENVIO DE EMAIL");
            //message.setText("TESTE TESTE");
            //Anexo 
            MimeBodyPart mbpMensagem = new MimeBodyPart();
            mbpMensagem.setText(mensagem);

            //partes do email
            Multipart mp = new MimeMultipart();
            mp.addBodyPart(mbpMensagem);

            //String Endereco_Anexo = "relatorio/RelatorioDeMateriais.pdf";
            //String Endereco_Anexo = anexo + ";";
            

            File Arquivo = new File(anexo);
            //setando o anexo
            MimeBodyPart mbpAnexo = new MimeBodyPart();
            mbpAnexo.setDataHandler(new DataHandler(new FileDataSource(Arquivo)));
            mbpAnexo.setFileName(Arquivo.getName());
            mp.addBodyPart(mbpAnexo);

//            
            //assunto do email
            message.setSubject(assunto);

            //seleciona o conteudo 
            message.setContent(mp);

            //envia o email
            Transport.send(message);

            System.out.println("Email enviado com sucesso!!!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

}
