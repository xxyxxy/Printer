package com.ysq.printer;

import android.content.Context;
import android.content.Intent;

/**
 * <pre>
 * author : 杨水强
 * time   : 2018/05/31
 * desc   :
 * version: 1.0
 * </pre>
 */
public class BluetoothPrinter implements Printable {

    private Context mContext;
    private String mAddress;

    public BluetoothPrinter(Context context, String address) {
        mContext = context;
        mAddress = address;
    }

    @Override
    public void init() {
        Intent intent = new Intent(mContext, BluetoothPrinterService.class);
        intent.putExtra(BluetoothPrinterService.EXTRA_TYPE, 0);
        intent.putExtra(BluetoothPrinterService.EXTRA_ADDRESS, mAddress);
        mContext.startService(intent);
    }

    @Override
    public void printTextLeft(String text) {
        Intent intent = new Intent(mContext, BluetoothPrinterService.class);
        intent.putExtra(BluetoothPrinterService.EXTRA_TYPE, 1);
        intent.putExtra(BluetoothPrinterService.EXTRA_TEXT, "我是蓝牙打印机");
        mContext.startService(intent);
    }

    @Override
    public void printTextCenter(String text) {
        Intent intent = new Intent(mContext, BluetoothPrinterService.class);
        intent.putExtra(BluetoothPrinterService.EXTRA_TYPE, 1);
        intent.putExtra(BluetoothPrinterService.EXTRA_TEXT, "我是蓝牙打印机");
        mContext.startService(intent);
    }

    @Override
    public void printTextHeightDoubleCenter(String text) {
        Intent intent = new Intent(mContext, BluetoothPrinterService.class);
        intent.putExtra(BluetoothPrinterService.EXTRA_TYPE, 1);
        intent.putExtra(BluetoothPrinterService.EXTRA_TEXT, "我是蓝牙打印机");
        mContext.startService(intent);
    }

    @Override
    public void printBarcode(String orderNumberStr) {
        Intent intent = new Intent(mContext, BluetoothPrinterService.class);
        intent.putExtra(BluetoothPrinterService.EXTRA_TYPE, 1);
        intent.putExtra(BluetoothPrinterService.EXTRA_TEXT, "我是蓝牙打印机");
        mContext.startService(intent);
    }

    @Override
    public void printQrcode(String text) {
        Intent intent = new Intent(mContext, BluetoothPrinterService.class);
        intent.putExtra(BluetoothPrinterService.EXTRA_TYPE, 1);
        intent.putExtra(BluetoothPrinterService.EXTRA_TEXT, "我是蓝牙打印机");
        mContext.startService(intent);
    }

    @Override
    public void startPrint() {
        Intent intent = new Intent(mContext, BluetoothPrinterService.class);
        intent.putExtra(BluetoothPrinterService.EXTRA_TYPE, 2);
        mContext.startService(intent);
    }

    @Override
    public void close() {
        Intent intent = new Intent(mContext, BluetoothPrinterService.class);
        intent.putExtra(BluetoothPrinterService.EXTRA_TYPE, 3);
        mContext.startService(intent);
    }
}
