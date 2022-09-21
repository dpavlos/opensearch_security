/*
* SPDX-License-Identifier: Apache-2.0
*
* The OpenSearch Contributors require contributions made to
* this file be licensed under the Apache-2.0 license or a
* compatible open source license.
*
* Modifications Copyright OpenSearch Contributors. See
* GitHub history for details.
*/

package org.opensearch.test.framework.certificate;

/**
* Contains static certificates for the test cluster. 
* Note: This is WIP and will be replaced by classes
* that can generate certificates on the fly. This
* class will be removed after that.
*/
public class Certificates {

	final static String ROOT_CA_CERTIFICATE = "-----BEGIN CERTIFICATE-----\n"
			+ "MIID/jCCAuagAwIBAgIBATANBgkqhkiG9w0BAQsFADCBjzETMBEGCgmSJomT8ixk\n"
			+ "ARkWA2NvbTEXMBUGCgmSJomT8ixkARkWB2V4YW1wbGUxGTAXBgNVBAoMEEV4YW1w\n"
			+ "bGUgQ29tIEluYy4xITAfBgNVBAsMGEV4YW1wbGUgQ29tIEluYy4gUm9vdCBDQTEh\n"
			+ "MB8GA1UEAwwYRXhhbXBsZSBDb20gSW5jLiBSb290IENBMB4XDTE4MDQyMjAzNDM0\n"
			+ "NloXDTI4MDQxOTAzNDM0NlowgY8xEzARBgoJkiaJk/IsZAEZFgNjb20xFzAVBgoJ\n"
			+ "kiaJk/IsZAEZFgdleGFtcGxlMRkwFwYDVQQKDBBFeGFtcGxlIENvbSBJbmMuMSEw\n"
			+ "HwYDVQQLDBhFeGFtcGxlIENvbSBJbmMuIFJvb3QgQ0ExITAfBgNVBAMMGEV4YW1w\n"
			+ "bGUgQ29tIEluYy4gUm9vdCBDQTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoC\n"
			+ "ggEBAK/u+GARP5innhpXK0c0q7s1Su1VTEaIgmZr8VWI6S8amf5cU3ktV7WT9SuV\n"
			+ "TsAm2i2A5P+Ctw7iZkfnHWlsC3HhPUcd6mvzGZ4moxnamM7r+a9otRp3owYoGStX\n"
			+ "ylVTQusAjbq9do8CMV4hcBTepCd+0w0v4h6UlXU8xjhj1xeUIz4DKbRgf36q0rv4\n"
			+ "VIX46X72rMJSETKOSxuwLkov1ZOVbfSlPaygXIxqsHVlj1iMkYRbQmaTib6XWHKf\n"
			+ "MibDaqDejOhukkCjzpptGZOPFQ8002UtTTNv1TiaKxkjMQJNwz6jfZ53ws3fh1I0\n"
			+ "RWT6WfM4oeFRFnyFRmc4uYTUgAkCAwEAAaNjMGEwDwYDVR0TAQH/BAUwAwEB/zAf\n"
			+ "BgNVHSMEGDAWgBSSNQzgDx4rRfZNOfN7X6LmEpdAczAdBgNVHQ4EFgQUkjUM4A8e\n"
			+ "K0X2TTnze1+i5hKXQHMwDgYDVR0PAQH/BAQDAgGGMA0GCSqGSIb3DQEBCwUAA4IB\n"
			+ "AQBoQHvwsR34hGO2m8qVR9nQ5Klo5HYPyd6ySKNcT36OZ4AQfaCGsk+SecTi35QF\n"
			+ "RHL3g2qffED4tKR0RBNGQSgiLavmHGCh3YpDupKq2xhhEeS9oBmQzxanFwWFod4T\n"
			+ "nnsG2cCejyR9WXoRzHisw0KJWeuNlwjUdJY0xnn16srm1zL/M/f0PvCyh9HU1mF1\n"
			+ "ivnOSqbDD2Z7JSGyckgKad1Omsg/rr5XYtCeyJeXUPcmpeX6erWJJNTUh6yWC/hY\n"
			+ "G/dFC4xrJhfXwz6Z0ytUygJO32bJG4Np2iGAwvvgI9EfxzEv/KP+FGrJOvQJAq4/\n"
			+ "BU36ZAa80W/8TBnqZTkNnqZV\n"
			+ "-----END CERTIFICATE-----\n"
			+ "";
	
	final static String NODE_CERTIFICATE = "-----BEGIN CERTIFICATE-----\n"
			+ "MIIEyTCCA7GgAwIBAgIGAWLrc1O2MA0GCSqGSIb3DQEBCwUAMIGPMRMwEQYKCZIm\n"
			+ "iZPyLGQBGRYDY29tMRcwFQYKCZImiZPyLGQBGRYHZXhhbXBsZTEZMBcGA1UECgwQ\n"
			+ "RXhhbXBsZSBDb20gSW5jLjEhMB8GA1UECwwYRXhhbXBsZSBDb20gSW5jLiBSb290\n"
			+ "IENBMSEwHwYDVQQDDBhFeGFtcGxlIENvbSBJbmMuIFJvb3QgQ0EwHhcNMTgwNDIy\n"
			+ "MDM0MzQ3WhcNMjgwNDE5MDM0MzQ3WjBeMRIwEAYKCZImiZPyLGQBGRYCZGUxDTAL\n"
			+ "BgNVBAcMBHRlc3QxDTALBgNVBAoMBG5vZGUxDTALBgNVBAsMBG5vZGUxGzAZBgNV\n"
			+ "BAMMEm5vZGUtMC5leGFtcGxlLmNvbTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCC\n"
			+ "AQoCggEBAJa+f476vLB+AwK53biYByUwN+40D8jMIovGXm6wgT8+9Sbs899dDXgt\n"
			+ "9CE1Beo65oP1+JUz4c7UHMrCY3ePiDt4cidHVzEQ2g0YoVrQWv0RedS/yx/DKhs8\n"
			+ "Pw1O715oftP53p/2ijD5DifFv1eKfkhFH+lwny/vMSNxellpl6NxJTiJVnQ9HYOL\n"
			+ "gf2t971ITJHnAuuxUF48HcuNovW4rhtkXef8kaAN7cE3LU+A9T474ULNCKkEFPIl\n"
			+ "ZAKN3iJNFdVsxrTU+CUBHzk73Do1cCkEvJZ0ZFjp0Z3y8wLY/gqWGfGVyA9l2CUq\n"
			+ "eIZNf55PNPtGzOrvvONiui48vBKH1LsCAwEAAaOCAVkwggFVMIG8BgNVHSMEgbQw\n"
			+ "gbGAFJI1DOAPHitF9k0583tfouYSl0BzoYGVpIGSMIGPMRMwEQYKCZImiZPyLGQB\n"
			+ "GRYDY29tMRcwFQYKCZImiZPyLGQBGRYHZXhhbXBsZTEZMBcGA1UECgwQRXhhbXBs\n"
			+ "ZSBDb20gSW5jLjEhMB8GA1UECwwYRXhhbXBsZSBDb20gSW5jLiBSb290IENBMSEw\n"
			+ "HwYDVQQDDBhFeGFtcGxlIENvbSBJbmMuIFJvb3QgQ0GCAQEwHQYDVR0OBBYEFKyv\n"
			+ "78ZmFjVKM9g7pMConYH7FVBHMAwGA1UdEwEB/wQCMAAwDgYDVR0PAQH/BAQDAgXg\n"
			+ "MCAGA1UdJQEB/wQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjA1BgNVHREELjAsiAUq\n"
			+ "AwQFBYISbm9kZS0wLmV4YW1wbGUuY29tgglsb2NhbGhvc3SHBH8AAAEwDQYJKoZI\n"
			+ "hvcNAQELBQADggEBAIOKuyXsFfGv1hI/Lkpd/73QNqjqJdxQclX57GOMWNbOM5H0\n"
			+ "5/9AOIZ5JQsWULNKN77aHjLRr4owq2jGbpc/Z6kAd+eiatkcpnbtbGrhKpOtoEZy\n"
			+ "8KuslwkeixpzLDNISSbkeLpXz4xJI1ETMN/VG8ZZP1bjzlHziHHDu0JNZ6TnNzKr\n"
			+ "XzCGMCohFfem8vnKNnKUneMQMvXd3rzUaAgvtf7Hc2LTBlf4fZzZF1EkwdSXhaMA\n"
			+ "1lkfHiqOBxtgeDLxCHESZ2fqgVqsWX+t3qHQfivcPW6txtDyrFPRdJOGhiMGzT/t\n"
			+ "e/9kkAtQRgpTb3skYdIOOUOV0WGQ60kJlFhAzIs=\n"
			+ "-----END CERTIFICATE-----\n"
			+ "";
	
	final static String NODE_KEY = "-----BEGIN PRIVATE KEY-----\n"
			+ "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCWvn+O+rywfgMC\n"
			+ "ud24mAclMDfuNA/IzCKLxl5usIE/PvUm7PPfXQ14LfQhNQXqOuaD9fiVM+HO1BzK\n"
			+ "wmN3j4g7eHInR1cxENoNGKFa0Fr9EXnUv8sfwyobPD8NTu9eaH7T+d6f9oow+Q4n\n"
			+ "xb9Xin5IRR/pcJ8v7zEjcXpZaZejcSU4iVZ0PR2Di4H9rfe9SEyR5wLrsVBePB3L\n"
			+ "jaL1uK4bZF3n/JGgDe3BNy1PgPU+O+FCzQipBBTyJWQCjd4iTRXVbMa01PglAR85\n"
			+ "O9w6NXApBLyWdGRY6dGd8vMC2P4KlhnxlcgPZdglKniGTX+eTzT7Rszq77zjYrou\n"
			+ "PLwSh9S7AgMBAAECggEABwiohxFoEIwws8XcdKqTWsbfNTw0qFfuHLuK2Htf7IWR\n"
			+ "htlzn66F3F+4jnwc5IsPCoVFriCXnsEC/usHHSMTZkL+gJqxlNaGdin6DXS/aiOQ\n"
			+ "nb69SaQfqNmsz4ApZyxVDqsQGkK0vAhDAtQVU45gyhp/nLLmmqP8lPzMirOEodmp\n"
			+ "U9bA8t/ttrzng7SVAER42f6IVpW0iTKTLyFii0WZbq+ObViyqib9hVFrI6NJuQS+\n"
			+ "IelcZB0KsSi6rqIjXg1XXyMiIUcSlhq+GfEa18AYgmsbPwMbExate7/8Ci7ZtCbh\n"
			+ "lx9bves2+eeqq5EMm3sMHyhdcg61yzd5UYXeZhwJkQKBgQDS9YqrAtztvLY2gMgv\n"
			+ "d+wOjb9awWxYbQTBjx33kf66W+pJ+2j8bI/XX2CpZ98w/oq8VhMqbr9j5b8MfsrF\n"
			+ "EoQvedA4joUo8sXd4j1mR2qKF4/KLmkgy6YYusNP2UrVSw7sh77bzce+YaVVoO/e\n"
			+ "0wIVTHuD/QZ6fG6MasOqcbl6hwKBgQC27cQruaHFEXR/16LrMVAX+HyEEv44KOCZ\n"
			+ "ij5OE4P7F0twb+okngG26+OJV3BtqXf0ULlXJ+YGwXCRf6zUZkld3NMy3bbKPgH6\n"
			+ "H/nf3BxqS2tudj7+DV52jKtisBghdvtlKs56oc9AAuwOs37DvhptBKUPdzDDqfys\n"
			+ "Qchv5JQdLQKBgERev+pcqy2Bk6xmYHrB6wdseS/4sByYeIoi0BuEfYH4eB4yFPx6\n"
			+ "UsQCbVl6CKPgWyZe3ydJbU37D8gE78KfFagtWoZ56j4zMF2RDUUwsB7BNCDamce/\n"
			+ "OL2bCeG/Erm98cBG3lxufOX+z47I8fTNfkdY2k8UmhzoZwurLm73HJ3RAoGBAKsp\n"
			+ "6yamuXF2FbYRhUXgjHsBbTD/vJO72/yO2CGiLRpi/5mjfkjo99269trp0C8sJSub\n"
			+ "5PBiSuADXFsoRgUv+HI1UAEGaCTwxFTQWrRWdtgW3d0sE2EQDVWL5kmfT9TwSeat\n"
			+ "mSoyAYR5t3tCBNkPJhbgA7pm4mASzHQ50VyxWs25AoGBAKPFx9X2oKhYQa+mW541\n"
			+ "bbqRuGFMoXIIcr/aeM3LayfLETi48o5NDr2NDP11j4yYuz26YLH0Dj8aKpWuehuH\n"
			+ "uB27n6j6qu0SVhQi6mMJBe1JrKbzhqMKQjYOoy8VsC2gdj5pCUP/kLQPW7zm9diX\n"
			+ "CiKTtKgPIeYdigor7V3AHcVT\n"
			+ "-----END PRIVATE KEY-----\n"
			+ "";
	
	final static String ADMIN_CERTIFICATE = "-----BEGIN CERTIFICATE-----\n"
			+ "MIIEdzCCA1+gAwIBAgIGAWLrc1O4MA0GCSqGSIb3DQEBCwUAMIGPMRMwEQYKCZIm\n"
			+ "iZPyLGQBGRYDY29tMRcwFQYKCZImiZPyLGQBGRYHZXhhbXBsZTEZMBcGA1UECgwQ\n"
			+ "RXhhbXBsZSBDb20gSW5jLjEhMB8GA1UECwwYRXhhbXBsZSBDb20gSW5jLiBSb290\n"
			+ "IENBMSEwHwYDVQQDDBhFeGFtcGxlIENvbSBJbmMuIFJvb3QgQ0EwHhcNMTgwNDIy\n"
			+ "MDM0MzQ3WhcNMjgwNDE5MDM0MzQ3WjBNMQswCQYDVQQGEwJkZTENMAsGA1UEBwwE\n"
			+ "dGVzdDEPMA0GA1UECgwGY2xpZW50MQ8wDQYDVQQLDAZjbGllbnQxDTALBgNVBAMM\n"
			+ "BGtpcmswggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDCwgBOoO88uMM8\n"
			+ "dREJsk58Yt4Jn0zwQ2wUThbvy3ICDiEWhiAhUbg6dTggpS5vWWJto9bvaaqgMVoh\n"
			+ "ElfYHdTDncX3UQNBEP8tqzHON6BFEFSGgJRGLd6f5dri6rK32nCotYS61CFXBFxf\n"
			+ "WumXjSukjyrcTsdkR3C5QDo2oN7F883MOQqRENPzAtZi9s3jNX48u+/e3yvJzXsB\n"
			+ "GS9Qmsye6C71enbIujM4CVwDT/7a5jHuaUp6OuNCFbdRPnu/wLYwOS2/yOtzAqk7\n"
			+ "/PFnPCe7YOa10ShnV/jx2sAHhp7ZQBJgFkkgnIERz9Ws74Au+EbptWnsWuB+LqRL\n"
			+ "x5G02IzpAgMBAAGjggEYMIIBFDCBvAYDVR0jBIG0MIGxgBSSNQzgDx4rRfZNOfN7\n"
			+ "X6LmEpdAc6GBlaSBkjCBjzETMBEGCgmSJomT8ixkARkWA2NvbTEXMBUGCgmSJomT\n"
			+ "8ixkARkWB2V4YW1wbGUxGTAXBgNVBAoMEEV4YW1wbGUgQ29tIEluYy4xITAfBgNV\n"
			+ "BAsMGEV4YW1wbGUgQ29tIEluYy4gUm9vdCBDQTEhMB8GA1UEAwwYRXhhbXBsZSBD\n"
			+ "b20gSW5jLiBSb290IENBggEBMB0GA1UdDgQWBBRsdhuHn3MGDvZxOe22+1wliCJB\n"
			+ "mDAMBgNVHRMBAf8EAjAAMA4GA1UdDwEB/wQEAwIF4DAWBgNVHSUBAf8EDDAKBggr\n"
			+ "BgEFBQcDAjANBgkqhkiG9w0BAQsFAAOCAQEAkPrUTKKn+/6g0CjhTPBFeX8mKXhG\n"
			+ "zw5z9Oq+xnwefZwxV82E/tgFsPcwXcJIBg0f43BaVSygPiV7bXqWhxASwn73i24z\n"
			+ "lveIR4+z56bKIhP6c3twb8WWR9yDcLu2Iroin7dYEm3dfVUrhz/A90WHr6ddwmLL\n"
			+ "3gcFF2kBu3S3xqM5OmN/tqRXFmo+EvwrdJRiTh4Fsf0tX1ZT07rrGvBFYktK7Kma\n"
			+ "lqDl4UDCF1UWkiiFubc0Xw+DR6vNAa99E0oaphzvCmITU1wITNnYZTKzVzQ7vUCq\n"
			+ "kLmXOFLTcxTQpptxSo5xDD3aTpzWGCvjExCKpXQtsITUOYtZc02AGjjPOQ==\n"
			+ "-----END CERTIFICATE-----\n"
			+ "";

	final static String ADMIN_KEY = "-----BEGIN PRIVATE KEY-----\n"
			+ "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDCwgBOoO88uMM8\n"
			+ "dREJsk58Yt4Jn0zwQ2wUThbvy3ICDiEWhiAhUbg6dTggpS5vWWJto9bvaaqgMVoh\n"
			+ "ElfYHdTDncX3UQNBEP8tqzHON6BFEFSGgJRGLd6f5dri6rK32nCotYS61CFXBFxf\n"
			+ "WumXjSukjyrcTsdkR3C5QDo2oN7F883MOQqRENPzAtZi9s3jNX48u+/e3yvJzXsB\n"
			+ "GS9Qmsye6C71enbIujM4CVwDT/7a5jHuaUp6OuNCFbdRPnu/wLYwOS2/yOtzAqk7\n"
			+ "/PFnPCe7YOa10ShnV/jx2sAHhp7ZQBJgFkkgnIERz9Ws74Au+EbptWnsWuB+LqRL\n"
			+ "x5G02IzpAgMBAAECggEAEzwnMkeBbqqDgyRqFbO/PgMNvD7i0b/28V0dCtCPEVY6\n"
			+ "klzrg3RCERP5V9AN8VVkppYjPkCzZ2A4b0JpMUu7ncOmr7HCnoSCj2IfEyePSVg+\n"
			+ "4OHbbcBOAoDTHiI2myM/M9++8izNS34qGV4t6pfjaDyeQQ/5cBVWNBWnKjS34S5H\n"
			+ "rJWpAcDgxYk5/ah2Xs2aULZlXDMxbSikjrv+n4JIYTKFQo8ydzL8HQDBRmXAFLjC\n"
			+ "gNOSHf+5u1JdpY3uPIxK1ugVf8zPZ4/OEB23j56uu7c8+sZ+kZwfRWAQmMhFVG/y\n"
			+ "OXxoT5mOruBsAw29m2Ijtxg252/YzSTxiDqFziB/eQKBgQDjeVAdi55GW/bvhuqn\n"
			+ "xME/An8E3hI/FyaaITrMQJUBjiCUaStTEqUgQ6A7ZfY/VX6qafOX7sli1svihrXC\n"
			+ "uelmKrdve/CFEEqzX9JWWRiPiQ0VZD+EQRsJvX85Tw2UGvVUh6dO3UGPS0BhplMD\n"
			+ "jeVpyXgZ7Gy5we+DWjfwhYrCmwKBgQDbLmQhRy+IdVljObZmv3QtJ0cyxxZETWzU\n"
			+ "MKmgBFvcRw+KvNwO+Iy0CHEbDu06Uj63kzI2bK3QdINaSrjgr8iftXIQpBmcgMF+\n"
			+ "a1l5HtHlCp6RWd55nWQOEvn36IGN3cAaQkXuh4UYM7QfEJaAbzJhyJ+wXA3jWqUd\n"
			+ "8bDTIAZ0ywKBgFuZ44gyTAc7S2JDa0Up90O/ZpT4NFLRqMrSbNIJg7d/m2EIRNkM\n"
			+ "HhCzCthAg/wXGo3XYq+hCdnSc4ICCzmiEfoBY6LyPvXmjJ5VDOeWs0xBvVIK74T7\n"
			+ "jr7KX2wdiHNGs9pZUidw89CXVhK8nptEzcheyA1wZowbK68yamph7HHXAoGBAK3x\n"
			+ "7D9Iyl1mnDEWPT7f1Gh9UpDm1TIRrDvd/tBihTCVKK13YsFy2d+LD5Bk0TpGyUVR\n"
			+ "STlOGMdloFUJFh4jA3pUOpkgUr8Uo/sbYN+x6Ov3+I3sH5aupRhSURVA7YhUIz/z\n"
			+ "tqIt5R+m8Nzygi6dkQNvf+Qruk3jw0S3ahizwsvvAoGAL7do6dTLp832wFVxkEf4\n"
			+ "gg1M6DswfkgML5V/7GQ3MkIX/Hrmiu+qSuHhDGrp9inZdCDDYg5+uy1+2+RBMRZ3\n"
			+ "vDUUacvc4Fep05zp7NcjgU5y+/HWpuKVvLIlZAO1MBY4Xinqqii6RdxukIhxw7eT\n"
			+ "C6TPL5KAcV1R/XAihDhI18Y=\n"
			+ "-----END PRIVATE KEY-----\n"
			+ "";
}