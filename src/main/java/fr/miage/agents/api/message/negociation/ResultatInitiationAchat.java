package fr.miage.agents.api.message.negociation;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

import java.util.UUID;

/**
 * Created by nitix on 30/11/16.
 */
public class ResultatInitiationAchat extends Message{

    public UUID session;

    public boolean success;

    public ResultatInitiationAchat() {
        super(TypeMessage.ResultatInitiationAchat);
    }
}
