package com.ls.libarys.pulltofresh;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.ls.libarys.pulltofresh.PullToRefreshLayout.OnRefreshListener;

/**
* @ClassName: MyListener  
* @Description: ����ˢ��listener
*   
 */
public class MyListener implements OnRefreshListener
{
//	private ProtbzBiz pb=new ProtbzBiz();

	@Override
	public void onRefresh(final PullToRefreshLayout pullToRefreshLayout)
	{
		// ����ˢ�²���
		new Handler()
		{
			@Override
			public void handleMessage(Message msg)
			{
				// ǧ������˸��߿ؼ�ˢ�������Ŷ��
				pullToRefreshLayout.refreshFinish(PullToRefreshLayout.SUCCEED);
				Log.i("ˢ�����", "ˢ�³ɹ�ඣ�");
			}
		}.sendEmptyMessageDelayed(0, 2000);
	}

	@Override
	public void onLoadMore(final PullToRefreshLayout pullToRefreshLayout)
	{
		// ���ز���
		new Handler()
		{
			@Override
			public void handleMessage(Message msg)
			{
				// ǧ������˸��߿ؼ����������Ŷ��
				pullToRefreshLayout.loadmoreFinish(PullToRefreshLayout.SUCCEED);
				Log.i("�������", "���سɹ�ඣ�");
//				pb=new ProtbzBiz();
//				pb.loadMorePro();
//				pb.loadAllPro();
			}
		}.sendEmptyMessageDelayed(0, 2000);
	}

}
