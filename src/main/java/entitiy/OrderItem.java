package entitiy;

import javax.persistence.*;
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private int id;
    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Orders order;
    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;
    private int orderPrice;
    private int count;
}
