package tn.esprit.spring.entity;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Entity
@Table( name ="chatMessage")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idChat")
    private Long idChat;
    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT, JOIN, RESPONSE, LEAVE
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}

