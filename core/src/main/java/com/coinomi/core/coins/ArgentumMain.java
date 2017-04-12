package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
* @author protonn
*/
public class ArgentumMain extends BitFamily {
	private ArgentumMain() {
		id = "Argentum.main";

		addressHeader = 23;
		p2shHeader = 5;
		acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
		spendableCoinbaseDepth = 100;
		dumpedPrivateKeyHeader = 151;

		name = "Argentum";
		symbol = "ARG";
		uriScheme = "argentum";
		bip44Index = 45;
		unitExponent = 8;
		feeValue = value(50000); // 0.0005 ARG 
		minNonDust = value(27300); // 0.00027300 ARG
		softDustLimit = value(50000); // 0.0005 ARG 
		softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
		signedMessageHeader = toBytes("Argentum Signed Message:\n");
	}

	private static ArgentumMain instance = new ArgentumMain();
	public static synchronized CoinType get() {
		return instance;
	}
}