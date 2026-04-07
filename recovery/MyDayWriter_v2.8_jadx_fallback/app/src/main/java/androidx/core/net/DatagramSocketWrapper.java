package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
class DatagramSocketWrapper extends java.net.Socket {

    private static class DatagramSocketImplWrapper extends java.net.SocketImpl {
        DatagramSocketImplWrapper(java.net.DatagramSocket r2, java.io.FileDescriptor r3) {
                r1 = this;
                r1.<init>()
                int r0 = r2.getLocalPort()
                r1.localport = r0
                r1.fd = r3
                return
        }

        @Override // java.net.SocketImpl
        protected void accept(java.net.SocketImpl r2) throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected int available() throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected void bind(java.net.InetAddress r2, int r3) throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected void close() throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected void connect(java.lang.String r2, int r3) throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected void connect(java.net.InetAddress r2, int r3) throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected void connect(java.net.SocketAddress r2, int r3) throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected void create(boolean r2) throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected java.io.InputStream getInputStream() throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketOptions
        public java.lang.Object getOption(int r2) throws java.net.SocketException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected java.io.OutputStream getOutputStream() throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected void listen(int r2) throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketImpl
        protected void sendUrgentData(int r2) throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.net.SocketOptions
        public void setOption(int r2, java.lang.Object r3) throws java.net.SocketException {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    DatagramSocketWrapper(java.net.DatagramSocket r2, java.io.FileDescriptor r3) throws java.net.SocketException {
            r1 = this;
            androidx.core.net.DatagramSocketWrapper$DatagramSocketImplWrapper r0 = new androidx.core.net.DatagramSocketWrapper$DatagramSocketImplWrapper
            r0.<init>(r2, r3)
            r1.<init>(r0)
            return
    }
}
