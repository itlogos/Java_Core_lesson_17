package ua.lviv.lgs;

public interface Iterator {

    public boolean hasNext();
    public Number next();

}


class Collection {

    private static Number[] arr;

    Collection(Number[] arr) {
        Collection.arr = arr;
    }


    
    public class First implements Iterator {

        private int count = 0;

        @Override
        public boolean hasNext() {

            return count < arr.length;
        }

        @Override
        public Number next() {
            int num = (int) arr[count++];

            if ((num % 2) != 0) {
                return (Number) num; 
            } else {
                return (Number) 0;
            }
        }
    }

    public First createFirst() {
        return new First();
    }



    public class Second implements Iterator {
        private int count = arr.length - 1;

        @Override
        public boolean hasNext() {

            return count >= 0;
        }

        @Override
        public Number next() {
            Number num = arr[count];
            count -= 2;
            return num;
        }
    }

    public Second createSecond() {
        return new Second();
    }


    public Iterator createAnonymousIterator() {

        return new Iterator() {
            int count = arr.length - 3;

            @Override
            public boolean hasNext() {
                return count >= 0;
            }

            @Override
            public Number next() {
                int num = (int) arr[count];
                count -= 3;
                if (((num % 2) == 1) || ((num % 2) == -1)) {
                    return (Number) num;
                } else {
                    return null;
                }

            }

        };
    }



    public Iterator createLocalIterator() {

        class Fourth implements Iterator {
            private int count = 4;

            @Override
            public boolean hasNext() {

                return count < arr.length;
            }

            @Override
            public Number next() {
                int num = (int) arr[count];   
                count += 5;
                if ((num % 2) == 0) {
                    return (Number) (num - 100);
                } else {
                    return (Number) num;
                }

            }

        }

        return new Fourth();

    }


    private static class Fifth implements Iterator {
        private int count = 1;

        @Override
        public boolean hasNext() {

            return count < arr.length;
        }

        @Override
        public Number next() {
            int num = (int) arr[count];
            count += 2;
            if ((num % 2) == 0) {
                return (Number) (num + 1);
            } else {
                return (Number) null;
            }

        }

    }

    public static Fifth createFifth() {
        return new Fifth();
    }

}