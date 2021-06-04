package com.shanebeestudios.mcdeop;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public enum Version {

    // Release
    SERVER_1_14_4(Type.SERVER, "1.14.4", "3dc3d84a581f14691199cf6831b71ed1296a9fdf", "46a7ba37c15820f00d49eafb38afb4a9bb64a0be"),
    CLIENT_1_14_4(Type.CLIENT, "1.14.4", "8c325a0c5bd674dd747d6ebaa4c791fd363ad8a9", "3a0e42172d082f18c4ee0b4561a6a2ecc9868a58"),
    SERVER_1_15(Type.SERVER, "1.15", "e9f105b3c5c7e85c7b445249a93362a22f62442d", "c79e5ee9c5167b730266910d4c5bafbaf27c2f52"),
    CLIENT_1_15(Type.CLIENT, "1.15", "7b07fd09d1e3aae1bc7a1304fedc73bfe5d81800", "a0bea08f0b96f6f30a350cd75270be63f7d0aac4"),
    SERVER_1_15_1(Type.SERVER, "1.15.1", "4d1826eebac84847c71a77f9349cc22afd0cf0a1", "d10e23f8def30fcf7d0a0d027f48f2731d80208f"),
    CLIENT_1_15_1(Type.CLIENT, "1.15.1", "8b11614bea9293592a947ea8f4fd72981ea66677", "24c55605b6ebd4ee0b28d41d609b68599ef23c67"),
    SERVER_1_15_2(Type.SERVER, "1.15.2", "bb2b6b1aefcd70dfd1892149ac3a215f6c636b07", "e018f7413ad5b98d7427bc3027c95c78845e891b"),
    CLIENT_1_15_2(Type.CLIENT, "1.15.2", "e3f78cd16f9eb9a52307ed96ebec64241cc5b32d", "e101497d78faca35dec18f632de16c25899b6f08"),
    SERVER_1_16(Type.SERVER, "1.16", "a0d03225615ba897619220e256a266cb33a44b6b", "a11471890ef5bdc4025dd7a587a46f106d56a7da"),
    CLIENT_1_16(Type.CLIENT, "1.16", "228fdf45541c4c2fe8aec4f20e880cb8fcd46621", "c04e0f0d37414fc022ca31062acb0ff1d67be331"),
    SERVER_1_16_1(Type.SERVER, "1.16.1", "a412fd69db1f81db3f511c1463fd304675244077", "a11471890ef5bdc4025dd7a587a46f106d56a7da"),
    CLIENT_1_16_1(Type.CLIENT, "1.16.1", "c9abbe8ee4fa490751ca70635340b7cf00db83ff", "588f9a7260759c0c10e193162f76fde005a46fe2"),
    SERVER_1_16_2(Type.SERVER, "1.16.2", "c5f6fb23c3876461d46ec380421e42b289789530", "0dbbb5aae568c2d9aa34e3be11e7b525054265d9"),
    CLIENT_1_16_2(Type.CLIENT, "1.16.2", "653e97a2d1d76f87653f02242d243cdee48a5144", "88fbd1c70c9244d23e6166a9703cc456d6f115e6"),
    SERVER_1_16_3(Type.SERVER, "1.16.3", "f02f4473dbf152c23d7d484952121db0b36698cb", "e75ff1e729aec4a3ec6a94fe1ddd2f5a87a2fd00"),
    CLIENT_1_16_3(Type.CLIENT, "1.16.3", "1321521b2caf934f7fc9665aab7e059a7b2bfcdf", "faac5028fbca3859db970cc4ca041aeec55f6d9d"),
    SERVER_1_16_4(Type.SERVER, "1.16.4", "35139deedbd5182953cf1caa23835da59ca3d7cd", "d9ae0e8e28475254855430ff051daaa0dd041a08"),
    CLIENT_1_16_4(Type.CLIENT, "1.16.4", "1952d94a0784e7abda230aae6a1e8fc0522dba99", "0837de813d1a6b67e23da3c520a84e872c8d2f0e"),
    SERVER_1_16_5(Type.SERVER, "1.16.5", "1b557e7b033b583cd9f66746b7a9ab1ec1673ced", "41285beda6d251d190f2bf33beadd4fee187df7a"),
    CLIENT_1_16_5(Type.CLIENT, "1.16.5", "37fd3c903861eeff3bc24b71eed48f828b5269c8", "374c6b789574afbdc901371207155661e0509e17"),

    // Snapshot
    // PreRelease
    SERVER_1_17_pre_1(Type.SERVER, "1.17 Pre-release 1", "80a01a1178bcfb67b42636df3a9cdd275f3cc4d4", "1f6f65434a5ac334607a1141d676f7974308ae36"),
    CLIENT_1_17_pre_1(Type.CLIENT, "1.17 Pre-release 1", "940af6eda421da56e3bf9c390df65ba713cc8f7f", "7310449e6c7bdd202e4f2cd6bd7ad177357f473c"),
    SERVER_1_17_pre_2(Type.SERVER, "1.17 Pre-release 2", "d8756c67ce3b3fe20d0510afb3e22fa16310b2e6", "f79c9cad034152d13c8fab69c441eb06138aacc6"),
    CLIENT_1_17_pre_2(Type.CLIENT, "1.17 Pre-release 2", "72ebf53f36151a9c2657dca80f72a97c0917d3ce", "c3fc5f17f6a63498078cbcc72872e78c500120f6"),
    SERVER_1_17_pre_3(Type.SERVER, "1.17 Pre-release 3", "18abbb3f980fc9b05188535db45a67276ea41f90", "394bffe6a0ba2ee2eaeb7163b0184afc533c704c"),
    CLIENT_1_17_pre_3(Type.CLIENT, "1.17 Pre-release 3", "3d587b97faf19d4c2fa63e03d1920eb37a95920b", "33e1b9881086dab9e89e919797fbf323870d2469"),
    SERVER_1_17_pre_4(Type.SERVER, "1.17 Pre-release 4", "528f491660bc5dc94c0d7911345a97438e5c1d86", "0bdafb07d9b092dec693b3a7181504ed4bc4f5c4"),
    CLIENT_1_17_pre_4(Type.CLIENT, "1.17 Pre-release 4", "de8e68ea23f837f9ab628cda7b16ba3de4b79153", "6be34fd616ed3f57869fb92df860d5c2d90e681c"),
    SERVER_1_17_pre_5(Type.SERVER, "1.17 Pre-release 5", "31bb40019e8d6e64299abafd743f4d3e1a1a68b2", "4fd01412588c91fbc94fb36eb9b57275de0f6be9"),
    CLIENT_1_17_pre_5(Type.CLIENT, "1.17 Pre-release 5", "ad51f4efbc250c15d84eaf07f600787246fa6cd6", "d1ddc678fa5d248aa855cf4723089ef6f7624b67"),
    SERVER_1_17_rc_1(Type.SERVER, "1.17 Release Candidate 1", "4de310c8c4f4a8ab4574246c1d63e3de3af1444d", "98a1398dc4144f92e10dd6967a231763741952e7"),
    CLIENT_1_17_rc_1(Type.CLIENT, "1.17 Release Candidate 1", "006320ab2a9969f0e0d3dc64a463e1816be5e225", "f98bcfe6126153d862d072c574dbe48af778f5d9"),

    // Combat Test
    SERVER_COMBAT_TEST_5(Type.SERVER, "combat_test_5", "0cc9a1582949297c8f1ca83b937c8d84ad295ffe", "44b2ca1d4677f3fffaa0333c87a42a9449e0bc52"),
    CLIENT_COMBAT_TEST_5(Type.CLIENT, "combat_test_5", "0ad80b317873e1f64a9a79af09a02ddef62ce67c", "5c9745ba8db67bcc95e6de65a3a6dd1d4c655726"),
    SERVER_COMBAT_TEST_6(Type.SERVER, "combat_test_6", "1c35c493ade7a39e2d02bcc326498aaab96f1a09", "6ddb98ca992d93fd654bf89f801223b1c4d98695"),
    CLIENT_COMBAT_TEST_6(Type.CLIENT, "combat_test_6", "4f08b4667575cbfc35e44c9556a0667bd3d0f5cc", "185a362b6b301bfb71e12f788ce8fb998b806217"),
    SERVER_COMBAT_TEST_7c(Type.SERVER, "combat_test_7c", "53c43fdae7d2ed01bbb31a82d99e31b9348e2a4b", "7f1369734e3e5585d44b211812274f2ad7ac160d"),
    CLIENT_COMBAT_TEST_7c(Type.CLIENT, "combat_test_7c", "14991d31f1002e5cbd97e62310cba614666f876b", "907af4fb6a7d676921f9bcb7aa80f8749bf03592"),
    SERVER_COMBAT_TEST_8b(Type.SERVER, "combat_test_8b", "635866257b4fc1ade528db8bd53ebbebb4816e5e", "57882209cb9b4e10303e7a7a2b3b3f93ae32bb8f"),
    CLIENT_COMBAT_TEST_8b(Type.CLIENT, "combat_test_8b", "123cf1bd6736a3c1a47e8c1727a3db18e3c9cace", "8d09f244923d77e27493038e02d926d401122f03"),
    SERVER_COMBAT_TEST_8c(Type.SERVER, "combat_cest_8c", "b707c44ac1503ad179fde86c78d41aa4d0cc78a5", "d89f9e0eb8fbe6f2c91e749e8b59391cd0dd96d4"),
    CLIENT_COMBAT_TEST_8c(Type.CLIENT, "combat_test_8c", "177472ace3ff5d98fbd63b4bcd5bbef5b035a018", "5ea38a7b8d58837c97214f2a46e5e12151d51f83"),

    // April Fools
    SERVER_20w14infinite(Type.SERVER, "20w14infinite", "c0711cd9608d1af3d6f05ac423dd8f4199780225", "a94a32e698caff0f5c5762b3dca045ddcd587071"),
    CLIENT_20w14infinite(Type.CLIENT, "20w14infinite", "cc5cb23748614a6396ffb77427b4f11f4b6ae99b", "3d91233a24c5de720f0eb41927a0b00e45e89caa");

    private final Type type;
    private final String version;
    private final String jar;
    private final String mappings;

    Version(Type type, String version, String jar, String mappings) {
        this.type = type;
        this.version = version;
        this.jar = jar + "/" + type.getName() + ".jar";
        this.mappings = mappings + "/" + type.getName() + ".txt";
    }

    public String getVersion() {
        return version;
    }

    public String getJar() {
        return OBJECTS + jar;
    }

    public String getMappings() {
        return OBJECTS + mappings;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Version{" +
                "type=" + type +
                ", version='" + version + '\'' +
                '}';
    }

    private static final String OBJECTS = "https://launcher.mojang.com/v1/objects/";
    private static final Map<String, Version> SERVER_VERSION_MAP = new HashMap<>();
    private static final Map<String, Version> CLIENT_VERSION_MAP = new HashMap<>();

    static {
        for (Version ver : values()) {
            if (ver.type == Type.SERVER) {
                SERVER_VERSION_MAP.put(ver.getVersion(), ver);
            } else {
                CLIENT_VERSION_MAP.put(ver.getVersion(), ver);
            }
        }
    }

    public static Version getByVersion(String ver, Type type) {
        if (type == Type.SERVER) {
            return SERVER_VERSION_MAP.get(ver);
        } else {
            return CLIENT_VERSION_MAP.get(ver);
        }
    }

    public enum Type {
        SERVER("server"), CLIENT("client");

        private final String name;

        Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

}
