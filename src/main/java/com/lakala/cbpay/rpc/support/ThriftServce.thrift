namespace java com.lakala.cbpay.rpc.support

struct SuperResponse {
  1: i32 status,
  2: map<string, string> headers,
  3: optional binary body
}

struct SuperRequest {
  1: string path,
  2: map<string, string> headers,
  3: optional binary body
}

service ThriftServce {
	SuperResponse execute(1:SuperRequest request);
	bool ping();
}
