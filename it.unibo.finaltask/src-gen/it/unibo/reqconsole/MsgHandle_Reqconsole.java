/* Generated by AN DISI Unibo */ 
package it.unibo.reqconsole;
import it.unibo.qactors.QActorContext;
import it.unibo.is.interfaces.IOutputEnvView;
import it.unibo.qactors.akka.QActorMsgQueue;

public class MsgHandle_Reqconsole extends QActorMsgQueue{
	public MsgHandle_Reqconsole(String actorId, QActorContext myCtx, IOutputEnvView outEnvView )  {
		super(actorId, myCtx, outEnvView);
	}
}
