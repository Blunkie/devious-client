package dev.unethicalite.api.packets;

import dev.unethicalite.api.game.Game;
import net.runelite.api.packets.PacketBufferNode;

public class PlayerPackets
{
	public static void queueItemUseOnPlayerPacket(int playerIndex, int itemId, int itemSlot, int itemWidgetId, boolean ctrlDown)
	{
		createItemOnPlayerPacket(playerIndex, itemId, itemSlot, itemWidgetId, ctrlDown).send();
	}

	public static void queueSpellOnPlayerPacket(int playerIndex, int spellWidgetId, boolean ctrlDown)
	{
		createSpellOnPlayer(playerIndex, spellWidgetId, ctrlDown).send();
	}

	public static void queuePlayerAction1Packet(int playerIndex, boolean ctrlDown)
	{
		createFirstAction(playerIndex, ctrlDown).send();
	}

	public static void queuePlayerAction2Packet(int playerIndex, boolean ctrlDown)
	{
		createSecondAction(playerIndex, ctrlDown).send();
	}

	public static void queuePlayerAction3Packet(int playerIndex, boolean ctrlDown)
	{
		createThirdAction(playerIndex, ctrlDown).send();
	}

	public static void queuePlayerAction4Packet(int playerIndex, boolean ctrlDown)
	{
		createFourthAction(playerIndex, ctrlDown).send();
	}

	public static void queuePlayerAction5Packet(int playerIndex, boolean ctrlDown)
	{
		createFifthAction(playerIndex, ctrlDown).send();
	}

	public static void queuePlayerAction6Packet(int playerIndex, boolean ctrlDown)
	{
		createSixthAction(playerIndex, ctrlDown).send();
	}

	public static void queuePlayerAction7Packet(int playerIndex, boolean ctrlDown)
	{
		createSeventhAction(playerIndex, ctrlDown).send();
	}

	public static void queuePlayerAction8Packet(int playerIndex, boolean ctrlDown)
	{
		createEighthAction(playerIndex, ctrlDown).send();
	}

	public static PacketBufferNode createItemOnPlayerPacket(int playerIndex, int itemId, int itemSlot, int itemWidgetId, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYERU(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAddLE(itemId);
		packetBufferNode.getPacketBuffer().writeShort(playerIndex);
		packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
		packetBufferNode.getPacketBuffer().writeIntIME(itemWidgetId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSpellOnPlayer(int playerIndex, int spellWidgetId, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYERT(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(-1);
		packetBufferNode.getPacketBuffer().writeShortAdd(playerIndex);
		packetBufferNode.getPacketBuffer().writeByteNeg(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeInt(spellWidgetId);
		packetBufferNode.getPacketBuffer().writeShort(-1);
		return packetBufferNode;
	}

	public static PacketBufferNode createFirstAction(int playerIndex, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER1(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(playerIndex);
		packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}

	public static PacketBufferNode createSecondAction(int playerIndex, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER2(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(playerIndex);
		packetBufferNode.getPacketBuffer().writeByteNeg(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}

	public static PacketBufferNode createThirdAction(int playerIndex, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER3(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShortAdd(playerIndex);
		return packetBufferNode;
	}

	public static PacketBufferNode createFourthAction(int playerIndex, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER4(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeByteNeg(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShort(playerIndex);
		return packetBufferNode;
	}

	public static PacketBufferNode createFifthAction(int playerIndex, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER5(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(playerIndex);
		packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}

	public static PacketBufferNode createSixthAction(int playerIndex, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER6(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAddLE(playerIndex);
		packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}

	public static PacketBufferNode createSeventhAction(int playerIndex, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER7(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(playerIndex);
		packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}

	public static PacketBufferNode createEighthAction(int playerIndex, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER8(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAddLE(playerIndex);
		packetBufferNode.getPacketBuffer().writeByteNeg(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}
}