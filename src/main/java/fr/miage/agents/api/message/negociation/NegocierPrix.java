package fr.miage.agents.api.message.negociation;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

import java.util.UUID;

/**
 * Created by nitix on 14/11/16.
 */
public class NegocierPrix extends Message {

    public UUID session;

    public float prixDemande;

    public NegocierPrix() {
        super(TypeMessage.NegocierPrix);
    }
}
