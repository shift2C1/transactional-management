package com.pipichao.config;

import com.pipichao.entity.BaseCustomer;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/*
* 事务的事件绑定监听器
* */

@Component
public class TransactionBoundEvent {

    //声明这是一个事务的事件监听器
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    //phase: 设置事务监听器的间断，默认是提交之后
    //
    //    BEFORE_COMMIT,
    //    AFTER_COMMIT,
    //    AFTER_ROLLBACK,
    //    AFTER_COMPLETION;
    public void commitListener(Object o){//这里的参数需要接收一个事务的事件监听参数
        System.out.println(o);
        System.out.println("事务提交了。。。。");
    }

    /**
     * 访问通过id查找客户的请求之后，打印日志：看到如下
     * */
//    BaseCustomer(customerNo=KH20200317KH4, name=张三, address=北京, contact=133, phone=133, deptId=4028b881707594eb017075a166dc0000, trade=3, nature=1, bank=133, account=133, taxNum=133, remark=哈哈, deleteFlag=0, opBy=SuperAdmin,SuperAdmin, opAt=Tue Mar 17 17:18:08 CST 2020)
//    ServletRequestHandledEvent: url=[/app/test]; client=[0:0:0:0:0:0:0:1]; method=[GET]; servlet=[dispatcherServlet]; session=[B5945228C75E8CDBB9DDF140D31712E2]; user=[null]; time=[9ms]; status=[OK]
//    事务提交了。。。。
}
