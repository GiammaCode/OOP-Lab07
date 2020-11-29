package it.unibo.oop.lab.nesting2;


import java.util.Iterator;
import java.util.List;

//import it.unibo.oop.lab.nesting2.Acceptor.ElementNotAcceptedException;
//import it.unibo.oop.lab.nesting2.Acceptor.EndNotAcceptedException;

public class OneListAcceptable<T> implements Acceptable<T> {
	private final List<T> list;
	
	public OneListAcceptable(final List<T> list) {
		this.list = list;
	}
	
	
	public Acceptor<T> acceptor() {
	        final Iterator<T> iterator = list.iterator();
	        return new Acceptor<T>() {

	            /**
	             * @param newElement
	             *            the new element to be accepted
	             */
	            @Override
	            public void accept(final T newElement) throws Acceptor.ElementNotAcceptedException {
	                try {
	                    if (newElement.equals(iterator.next())) {
	                        return;
	                    }
	                } catch (Exception e) {
	                    System.out.println("no more element to be evaluated");
	                }
	                throw new Acceptor.ElementNotAcceptedException(newElement);
	            }

	            @Override
	            public void end() throws Acceptor.EndNotAcceptedException {
	                try {
	                    if (!iterator.hasNext()) {
	                        return;
	                    }
	                } catch (Exception e) {
	                    System.out.println("2" + e.getMessage());
	                }
	                throw new Acceptor.EndNotAcceptedException();
	            }
	        };
	    }
}
