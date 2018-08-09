package book_ex.chap03.abstraction;

public class SocketDataReader implements ByteSource {
    @Override
    public byte[] read() {
        return new byte[0];
    }
}
