package SendingEmail;
import com.sun.mail.pop3.POP3Store;
import javax.mail.*;
import java.util.Properties;
public class ReceiveMail {
    public static void main(String[] args) throws Exception{
//        get session object
        Properties properties= new Properties();
        properties.put("mail.pop3s.host","pop.gmail.com");
        properties.put("mail.pop3s.port","995");
        properties.put("mail.pop3s.starttls.enable","true");

        Session emailSession = Session.getDefaultInstance(properties);

//         An abstract class that models a message store and its access protocol,
//         for storing and retrieving messages
//        create POP3 store object and connect with the pop server
        POP3Store emailStore = (POP3Store) emailSession.
                getStore("pop3s");
        emailStore.
                connect("suraznep@gmail.com","dnnndizthrmbzdyd");

// abstract class that represents a folder for mail messages
//        create a folder and open it

        Folder emailFolder = emailStore.getFolder("INBOX");
        emailFolder.open(Folder.READ_ONLY);

        Message[] messages = emailFolder.getMessages();

        for (Message message : messages)
        {
            System.out.println(message.getSubject());
        }

        emailFolder.close();
        emailStore.close();

    }
}
