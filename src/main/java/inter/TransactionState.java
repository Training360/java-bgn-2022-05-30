package inter;

public enum TransactionState {
    SUCCESS {
        @Override
        public boolean isComplete() {
            return true;
        }
    }, REJECTED {
        @Override
        public boolean isComplete() {
            return true;
        }
    }, PENDING {
        @Override
        public boolean isComplete() {
            return false;
        }
    };
    public abstract boolean isComplete();
}