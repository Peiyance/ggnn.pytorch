// Java Package mergesort is a proxy for talking to a Go program.
//   gobind -lang=java github.com/jcscottiii/mergesort_benchmark/mergesort
//
// File is generated by gobind. Do not edit.
package go.mergesort;

import go.Seq;

public abstract class Mergesort {
    private Mergesort() {} // uninstantiable
    
    public static long GoMergeSortEntry(long size, long ascending) {
        go.Seq _in = new go.Seq();
        go.Seq _out = new go.Seq();
        long _result;
        _in.writeInt(size);
        _in.writeInt(ascending);
        Seq.send(DESCRIPTOR, CALL_GoMergeSortEntry, _in, _out);
        _result = _out.readInt();
        return _result;
    }
    
    private static final int CALL_GoMergeSortEntry = 1;
    private static final String DESCRIPTOR = "mergesort";
}