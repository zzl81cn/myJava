# Provider
> src\main\java\com\hirsun\jewelry\api\(审核、直售、快递信息、首页、订单服务、服务、上传服务……)

## D:\Workspaces\hiersun\jr-api-business-provider\src\main\java\com\hiersun\jewelry\api\direct\mapper\JrdsOrderMapper.xml
###     <!--通过订单状态查询订单信息列表（商品图片、商品描述、价格、订单状态）-->
    <select id="selectOrderListByOrderStatus" parameterType="java.util.Map" resultType="java.util.Map">
        SELECT jo.order_status, jg.host_gragp, jg.good_desc, jo.order_amount FROM jrds_order AS jo
        INNER JOIN jrds_good AS jg ON jo.good_id = jg.id
        WHERE jo.order_status = #{orderStatus}
        AND jo.seller_member_id = #{memberId}
        AND jo.delete_status = 0
    </select>

## 紧挨着
## D:\Workspaces\hiersun\jr-api-business-provider\src\main\java\com\hiersun\jewelry\api\direct\service\impl\DirectOrderServiceImpl.java