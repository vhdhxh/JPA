package entitiy;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.h2.value.Value;

import javax.naming.Name;
import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ITEM_ID")
    private int Id;



    private String name;

    private int price;

    private int stockQuantity;
}
