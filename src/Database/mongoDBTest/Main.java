package Database.mongoDBTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {

   public static void main(String[] args) {
      try {
         // mongodb에 접속
         MongoClient mongoClient = new MongoClient("localhost", 27017);
         // 데이터베이스 연결
         MongoDatabase mongoDatabase = mongoClient.getDatabase("mydb");
         // 컬렉션연결
         MongoCollection collection = mongoDatabase.getCollection("member");
         // 다큐멘트 조회
         FindIterable iterDoc = collection.find();
         int i = 1;
         Iterator it = iterDoc.iterator(); // Vector<E>, ArrayList<E> 가 상속받는 인터페이스
         List<Document> list = new ArrayList<Document>();

         while (it.hasNext()) {
            list.add((Document) it.next());
         }
         for (Document document : list) {
            System.out.println("회원아이디: " + document.get("userid"));
            System.out.println("비밀번호: " + document.get("pwd"));
            System.out.println("이름: " + document.get("name"));
            System.out.println("전화번호: " + document.get("telno"));
            System.out.println("키: " + document.get("height") + "cm");
            System.out.println("몸무게: " + document.get("weight") + "kg");
            System.out.println("--------------------------------------------");
         }
      } catch (Exception e) {
         System.out.println(e.getClass().getName() + e.getMessage());
      }

   }

}