package cn.fzx.demo.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

/**
 * @author     ：zhuoxi.fan
 * @date       ：Created in 2019/9/30 13:57
 * @description：netty服务端
 */
public class NettyServer {

    public static String port="7001";

    /**
     *
     */
    public void server(){
        //主线程组 接收网络请求
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //worker线程组，对接受到的请求进行读写处理
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        //启动服务的启动类（辅助类）
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup,workerGroup);


    }



}
