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
		spendableCoinbaseDepth = 30;
		dumpedPrivateKeyHeader = 151;

		name = "Argentum";
		symbol = "ARG";
		uriScheme = "argentum";
		bip44Index = 45;
		unitExponent = 8;
		feeValue = value(500000); // 0.005 ARG 
		minNonDust = value(1); // 0.00000001 ARG
		softDustLimit = value(100000000); // 1 ARG 
		softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
		signedMessageHeader = toBytes("Argentum Signed Message:\n");
	}

	private static ArgentumMain instance = new ArgentumMain();
	public static synchronized CoinType get() {
		return instance;
	}
}