package kr.ac.ajou.lazybones.washerapp.Washer;


/**
* kr/ac/ajou/lazybones/washerapp/Washer/ReservationQueueOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from washer.idl
* 2015�� 6�� 10�� ������ ���� 4�� 12�� 23�� KST
*/

public interface ReservationQueueOperations 
{
  kr.ac.ajou.lazybones.washerapp.Washer.Reservation[] reservations ();
  kr.ac.ajou.lazybones.washerapp.Washer.Reservation[] reservationsBy (String who);
  boolean enqueue (String who, long duration);
  kr.ac.ajou.lazybones.washerapp.Washer.Reservation dequeue ();
  boolean isEmpty ();
  boolean remove (int index);
} // interface ReservationQueueOperations