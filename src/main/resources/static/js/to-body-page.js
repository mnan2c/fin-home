/*
 * 利用div实现左边点击右边显示的效果（以id="content"的div进行内容展示）
 * 注意：
 *   ①：js获取网页的地址，是根据当前网页来相对获取的，不会识别根目录；
 *   ②：如果右边加载的内容显示页里面有css，必须放在主页（即例中的index.jsp）才起作用
 *   （如果单纯的两个页面之间include，子页面的css和js在子页面是可以执行的。 主页面也可以调用子页面的js。但这时要考虑页面中js和渲染的先后顺序 ）
 */
function showAtRight(url) {
    $.ajax({
        type: "GET",
        url: "redirect" + url,
        dataType: "json",
        success: function (data) {
            var html = '';
            $('#body-page').empty();   //清空resText里面的所有内容
            html += data;
        }
    });
    // $('#body-page').html(html);
}